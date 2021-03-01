package laboratoryestudents.app.controller;

import laboratoryestudents.app.service.AllenNetworkService;
import laboratoryestudents.app.service.AllenNeumaticService;
import laboratoryestudents.app.service.SiemmensService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class App {
    @Autowired
    private AllenNetworkService allenNetworkService;

    @Autowired
    private AllenNeumaticService allenNeumaticService;

    @Autowired
    private SiemmensService siemmensService;

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


}
