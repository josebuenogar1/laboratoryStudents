package laboratoryestudents.app.controller;


import laboratoryestudents.app.model.AllenNetwork;
import laboratoryestudents.app.model.AllenNeumatic;
import laboratoryestudents.app.model.Siemmens;
import laboratoryestudents.app.model.StudentRecord;
import laboratoryestudents.app.service.AllenNetworkService;
import laboratoryestudents.app.service.AllenNeumaticService;
import laboratoryestudents.app.service.SiemmensService;
import laboratoryestudents.app.service.StudentRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.Date;
import java.util.List;

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

    @RequestMapping(value="/")
    public String index(){

        return "index";
    }

    @RequestMapping(value="/allenNetwork")
    public String allenNetwork(Model model){

        List<AllenNetwork> listHours = allenNetworkService.listAll();
        model.addAttribute("listHours",listHours);
        return "allenNetwork";
    }

    @RequestMapping(value="/allenNeumatic")
    public String allenNeumatic(Model model){

        List<AllenNeumatic> listHours = allenNeumaticService.listAll();
        model.addAttribute("listHours",listHours);
        return "allenNeumatic";
    }

    @RequestMapping(value="/siemmens")
    public String siemmens(Model model){

        List<Siemmens> listHours = siemmensService.listAll();
        model.addAttribute("listHours",listHours);
        return "siemmens";
    }

    @RequestMapping(path ="/register/{workStation}/{date_id}/{hour_number}" , method = RequestMethod.GET)
    public String showForm(Model model,  @PathVariable String workStation, @PathVariable Date date_id, @PathVariable String hour_number ) {
        StudentRecord studentRecord = new StudentRecord();
        studentRecord.setStudentRecordId(workStation,date_id,hour_number);
        model.addAttribute("studentRecord", studentRecord);
        return "register_form";
    }


    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("studentRecord") StudentRecord studentRecord) {
        System.out.println(studentRecord.getStudentRecordId());
        studentRecordService.saveStudentRecord(studentRecord);

        return "redirect:/";
    }


}
