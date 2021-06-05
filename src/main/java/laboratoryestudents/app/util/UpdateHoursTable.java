package laboratoryestudents.app.util;

import laboratoryestudents.app.model.AllenNetwork;
import laboratoryestudents.app.model.AllenNeumatic;
import laboratoryestudents.app.model.Siemmens;
import laboratoryestudents.app.model.StudentRecord;
import laboratoryestudents.app.service.AllenNetworkService;
import laboratoryestudents.app.service.AllenNeumaticService;
import laboratoryestudents.app.service.SiemmensService;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.util.Optional;

public class UpdateHoursTable {

    @Autowired
    private AllenNetworkService allenNetworkService;

    @Autowired
    private AllenNeumaticService allenNeumaticService;

    @Autowired
    private SiemmensService siemmensService;

    @Autowired
    private MapTableHour mapTableHour;


    public void setTable(StudentRecord obj) {
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
