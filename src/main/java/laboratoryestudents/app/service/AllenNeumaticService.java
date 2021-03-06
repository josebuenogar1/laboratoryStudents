package laboratoryestudents.app.service;


import laboratoryestudents.app.model.AllenNetwork;
import laboratoryestudents.app.model.AllenNeumatic;
import laboratoryestudents.app.repository.AllenNeumaticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AllenNeumaticService {

    @Autowired
    private AllenNeumaticRepository repository;

    public List<AllenNeumatic> listAll(){
        return repository.findAll();
    }

    public Optional<AllenNeumatic> findById(Date date){
        return repository.findById(date);
    }

    public void save(AllenNeumatic table) {
        repository.save(table);
    }
}
