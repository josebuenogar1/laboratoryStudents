package laboratoryestudents.app.service;

import laboratoryestudents.app.model.AllenNetwork;
import laboratoryestudents.app.model.Siemmens;
import laboratoryestudents.app.repository.SiemmensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SiemmensService {
    @Autowired
    private SiemmensRepository repository;

    public List<Siemmens> listAll(){
        return repository.findAll();
    }

    public Optional<Siemmens> findById(Date date){
        return repository.findById(date);
    }

    public void save(Siemmens table) {
        repository.save(table);
    }

}
