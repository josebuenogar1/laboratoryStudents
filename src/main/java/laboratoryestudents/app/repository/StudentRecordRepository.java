package laboratoryestudents.app.repository;

import laboratoryestudents.app.model.StudentRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRecordRepository extends JpaRepository<StudentRecord, String> {
}

