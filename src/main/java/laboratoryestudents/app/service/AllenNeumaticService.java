package laboratoryestudents.app.service;


import laboratoryestudents.app.controller.AllenNetwork;
import laboratoryestudents.app.controller.AllenNeumatic;
import laboratoryestudents.app.repository.AllenNeumaticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AllenNeumaticService {

    @Autowired
    private AllenNeumaticRepository repository;

    public List<AllenNeumatic> listAll(){
        return repository.findAll();
    }
}
