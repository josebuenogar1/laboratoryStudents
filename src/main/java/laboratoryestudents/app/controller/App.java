package laboratoryestudents.app.controller;

import com.lowagie.text.DocumentException;
import laboratoryestudents.app.model.*;
import laboratoryestudents.app.service.AllenNetworkService;
import laboratoryestudents.app.service.AllenNeumaticService;
import laboratoryestudents.app.service.SiemmensService;
import laboratoryestudents.app.service.StudentRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.sql.Date;
import java.util.List;
import java.util.Optional;


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

    @RequestMapping(value = "/")
    public String index() {

        return "index";
    }

    @RequestMapping(value = "/allenNetwork")
    public String allenNetwork(Model model) {

        List<AllenNetwork> listHours = allenNetworkService.listAll();
        model.addAttribute("listHours", listHours);
        return "allenNetwork";
    }

    @RequestMapping(value = "/allenNeumatic")
    public String allenNeumatic(Model model) {

        List<AllenNeumatic> listHours = allenNeumaticService.listAll();
        model.addAttribute("listHours", listHours);
        return "allenNeumatic";
    }

    @RequestMapping(value = "/siemmens")
    public String siemmens(Model model) {

        List<Siemmens> listHours = siemmensService.listAll();
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
        mapTableHour(table, hour);
        allenNetworkService.save(table);

    }


    private void updateHoursAllenNeumatic(Date date, String hour) {
        Optional<AllenNeumatic> tableResponse = allenNeumaticService.findById(date);
        AllenNeumatic table = tableResponse.get();
        mapTableHour(table, hour);
        allenNeumaticService.save(table);

    }

    private void updateHoursSiemmens(Date date, String hour) {
        Optional<Siemmens> tableResponse = siemmensService.findById(date);
        Siemmens table = tableResponse.get();
        mapTableHour(table, hour);
        siemmensService.save(table);
    }


    private void mapTableHour(DatabaseTemplate table, String hour) {
        if (hour.equals("7")) {
            table.setSeven_am(false);
            return;
        }
        if (hour.equals("8")) {
            table.setEight_am(false);
            return;
        }
        if (hour.equals("9")) {
            table.setNine_am(false);
            return;
        }
        if (hour.equals("10")) {
            table.setTen_am(false);
            return;
        }
        if (hour.equals("11")) {
            table.setEleven_am(false);
            return;
        }
        if (hour.equals("12")) {
            table.setTwelve_am(false);
            return;
        }
        if (hour.equals("13")) {
            table.setOne_pm(false);
            return;
        }
        if (hour.equals("14")) {
            table.setTwo_pm(false);
            return;
        }
        if (hour.equals("15")) {
            table.setThree_pm(false);
            return;
        }
        if (hour.equals("16")) {
            table.setFour_pm(false);
            return;
        }
        if (hour.equals("17")) {
            table.setFive_pm(false);
            return;
        }
        if (hour.equals("18")) {
            table.setEight_pm(false);
            return;
        }
        if (hour.equals("19")) {
            table.setSeven_pm(false);
            return;
        }
        if (hour.equals("20")) {
            table.setEight_pm(false);
            return;
        }
        if (hour.equals("21")) {
            table.setNine_pm(false);
            return;
        }

    }

}
