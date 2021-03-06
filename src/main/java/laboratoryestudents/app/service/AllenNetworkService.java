package laboratoryestudents.app.service;

import laboratoryestudents.app.model.AllenNetwork;
import laboratoryestudents.app.repository.AllenNetworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AllenNetworkService {

    @Autowired
    private AllenNetworkRepository repository;

    public List<AllenNetwork> listAll(){
        return repository.findAll();
    }

    public Optional<AllenNetwork> findById(Date date){
        return repository.findById(date);
    }

    public void save(AllenNetwork table) {
        repository.save(table);
    }
}
