package laboratoryestudents.app.service;

import laboratoryestudents.app.controller.AllenNeumatic;
import laboratoryestudents.app.controller.Siemmens;
import laboratoryestudents.app.repository.SiemmensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SiemmensService {
    @Autowired
    private SiemmensRepository repository;

    public List<Siemmens> listAll(){
        return repository.findAll();
    }

}
