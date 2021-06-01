package laboratoryestudents.app.configuration;

import laboratoryestudents.app.util.DatesGenerator;
import laboratoryestudents.app.util.MapTableHour;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class appConfiguration {

    @Bean
    public MapTableHour mapTableHourService(){
        return new MapTableHour();
    }

    @Bean
    public DatesGenerator datesGeneratorService(){return new DatesGenerator();
    }
}
