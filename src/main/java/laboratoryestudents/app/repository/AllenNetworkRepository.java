package laboratoryestudents.app.repository;


import laboratoryestudents.app.controller.AllenNetwork;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;

public interface AllenNetworkRepository extends JpaRepository<AllenNetwork,Date> {

}


