package kg.it.service;

import kg.it.entity.DeliveryMans;
import kg.it.repository.DeliveryManRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryMansServiceIml implements  DeliveryMansService {
    @Autowired
    private DeliveryManRepository deliveryManRepository;

//    @Autowired
//    private PasswordEncoder passwordEncoder;


    @Override
    public List<DeliveryMans> getAll() {
        return deliveryManRepository.findAll();
    }

    @Override
    public DeliveryMans create(DeliveryMans deliveryMans) {
//        String encodePassWord = passwordEncoder.encode(deliveryMans.getPassword());
//        deliveryMans.setPassword(encodePassWord);
        return deliveryManRepository.save(deliveryMans);
    }

    @Override
    public DeliveryMans getById(Long id) {
        return deliveryManRepository.findById(id).orElse(null);
    }

    @Override
    public DeliveryMans update(DeliveryMans deliveryMans) {
        return deliveryManRepository.save(deliveryMans);
    }

    @Override
    public DeliveryMans deleteById(Long id) {
        DeliveryMans deliveryMans = getById(id);
        if ( deliveryMans!=null){
            deliveryManRepository.deleteById(id);
        }
        return null;
    }
}
