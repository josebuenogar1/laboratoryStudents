package laboratoryestudents.app.service;

import laboratoryestudents.app.model.AllenNetwork;
import laboratoryestudents.app.repository.AllenNetworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AllenNetworkService {

    @Autowired
    private AllenNetworkRepository repository;

    public List<AllenNetwork> listAll(){
        return repository.findAll();
    }
}
