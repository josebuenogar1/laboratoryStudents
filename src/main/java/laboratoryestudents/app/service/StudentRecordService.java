package laboratoryestudents.app.service;

import laboratoryestudents.app.model.StudentRecord;
import laboratoryestudents.app.repository.SiemmensRepository;
import laboratoryestudents.app.repository.StudentRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class StudentRecordService {
    @Autowired
    private StudentRecordRepository studentRecordRepository;

    public void saveStudentRecord(StudentRecord studentRecord){
        studentRecordRepository.save(studentRecord);

    }

    public StudentRecord get(String id) {
        return studentRecordRepository.findById(id).get();
    }
}
