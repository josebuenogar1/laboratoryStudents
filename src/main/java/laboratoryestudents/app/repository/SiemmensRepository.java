package laboratoryestudents.app.repository;

import laboratoryestudents.app.model.Siemmens;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;

public interface SiemmensRepository extends JpaRepository<Siemmens, Date> {
}
