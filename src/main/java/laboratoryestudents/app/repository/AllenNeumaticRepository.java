package laboratoryestudents.app.repository;

import laboratoryestudents.app.controller.AllenNetwork;
import laboratoryestudents.app.controller.AllenNeumatic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;

public interface AllenNeumaticRepository extends JpaRepository<AllenNeumatic, Date> {
}
