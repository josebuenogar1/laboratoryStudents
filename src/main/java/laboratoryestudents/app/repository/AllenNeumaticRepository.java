package laboratoryestudents.app.repository;

import laboratoryestudents.app.model.AllenNeumatic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;

public interface AllenNeumaticRepository extends JpaRepository<AllenNeumatic, Date> {
}
