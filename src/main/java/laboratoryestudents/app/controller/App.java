package laboratoryestudents.app.controller;

import com.lowagie.text.DocumentException;
import laboratoryestudents.app.model.*;
import laboratoryestudents.app.service.AllenNetworkService;
import laboratoryestudents.app.service.AllenNeumaticService;
import laboratoryestudents.app.service.SiemmensService;
import laboratoryestudents.app.service.StudentRecordService;
import laboratoryestudents.app.util.DatesGenerator;
import laboratoryestudents.app.util.MapTableHour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.sql.Date;
import java.util.*;



@Controller
public class App {
    @Autowired
    private AllenNetworkService allenNetworkService;

    @Autowired
    private AllenNeumaticService allenNeumaticService;

    @Autowired
    private SiemmensService siemmensService;

    @Autowired
    private StudentRecordService studentRecordService;

    @Autowired
    private MapTableHour mapTableHour;

    @Autowired
    private DatesGenerator datesGenerator;

    @RequestMapping(value = "/")
    public String index() {

        return "index";
    }

    @RequestMapping(value = "/allenNetwork")
    public String allenNetwork(Model model) {

        List<AllenNetwork> listHours= new ArrayList<>();
        List<Date> dates =new ArrayList<>();
        Optional<AllenNetwork> hours = Optional.empty();

        dates= datesGenerator.generate(dates);

        for (Date date :  dates) {
            hours = allenNetworkService.findById(date);
            try {
                listHours.add(hours.get());
            }catch (Exception e){
                System.out.println("Does not exist date on DB" );
                break;
            }
        }

        model.addAttribute("listHours", listHours);
        return "allenNetwork";
    }


    @RequestMapping(value = "/allenNeumatic")
    public String allenNeumatic(Model model) {
        List<AllenNeumatic> listHours = new ArrayList<>();
        List<Date> dates =new ArrayList<>();
        Optional<AllenNeumatic> hours = Optional.empty();
        dates=datesGenerator.generate(dates);

        for (Date date :  dates) {
            hours = allenNeumaticService.findById(date);
            try {
                listHours.add(hours.get());
            }catch (Exception e){
                System.out.println("Does not exist date on DB" );
                break;
            }
        }


        model.addAttribute("listHours", listHours);
        return "allenNeumatic";
    }

    @RequestMapping(value = "/siemmens")
    public String siemmens(Model model) {

        List<Siemmens> listHours = new ArrayList<>();
        List<Date> dates =new ArrayList<>();
        Optional<Siemmens> hours = Optional.empty();

        dates=datesGenerator.generate(dates);

        for (Date date :  dates) {
            hours = siemmensService.findById(date);
            try {
            listHours.add(hours.get());
            }catch (Exception e){
                System.out.println("Does not exist date on DB" );
                break;
            }
        }

        model.addAttribute("listHours", listHours);
        return "siemmens";
    }

    @RequestMapping(path = "/register/{workStation}/{date_id}/{hour_number}", method = RequestMethod.GET)
    public String showForm(Model model, @PathVariable String workStation, @PathVariable Date date_id, @PathVariable String hour_number) {
        StudentRecord studentRecord = new StudentRecord();
        studentRecord.setStudentRecordId(workStation, date_id, hour_number);
        model.addAttribute("studentRecord", studentRecord);
        return "register_form";
    }

    @RequestMapping(path ="/export/pdf/{studentRecordId}" , method = RequestMethod.GET)
    public void exportToPDF(HttpServletResponse response, @PathVariable String studentRecordId) throws DocumentException, IOException {
        response.setContentType("application/pdf");
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users_.pdf";
        response.setHeader(headerKey, headerValue);
        StudentRecord studentRecord = studentRecordService.get(studentRecordId);
        StudentRecordPdf studentRecordPdf = new StudentRecordPdf(studentRecord);
        studentRecordPdf.export(response);

    }


    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public String saveProduct(@Valid  @ModelAttribute("studentRecord") StudentRecord studentRecord, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "register_form";
        } else {
            studentRecordService.saveStudentRecord(studentRecord);
            updateHoursTable(studentRecord);

            return "register_success";
        }
    }

    public void updateHoursTable(StudentRecord obj) {
        String table = obj.getWorkStation();
        Date date = obj.getDate_id();
        String hour = obj.getHour_number();

        if (table.equals("allenNetwork")) {
            updateHoursAllenNetwork(date, hour);
            return;
        }

        if (table.equals("allenNeumatic")) {
            updateHoursAllenNeumatic(date, hour);
            return;
        }

        if (table.equals("siemmens")) {
            updateHoursSiemmens(date, hour);
            return;
        }

    }

    public void updateHoursAllenNetwork(Date date, String hour) {
        Optional<AllenNetwork> tableResponse = allenNetworkService.findById(date);
        AllenNetwork table = tableResponse.get();
        mapTableHour.setFalse(table, hour);
        allenNetworkService.save(table);

    }


    private void updateHoursAllenNeumatic(Date date, String hour) {
        Optional<AllenNeumatic> tableResponse = allenNeumaticService.findById(date);
        AllenNeumatic table = tableResponse.get();
        mapTableHour.setFalse(table, hour);
        allenNeumaticService.save(table);

    }

    private void updateHoursSiemmens(Date date, String hour) {
        Optional<Siemmens> tableResponse = siemmensService.findById(date);
        Siemmens table = tableResponse.get();
        mapTableHour.setFalse(table, hour);
        siemmensService.save(table);
    }


    }




