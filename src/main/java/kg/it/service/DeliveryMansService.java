package kg.it.service;

import kg.it.entity.DeliveryMans;

import java.util.List;

public interface DeliveryMansService {
     List<DeliveryMans> getAll();
     DeliveryMans create(DeliveryMans deliveryMans);
     DeliveryMans getById(Long id);
     DeliveryMans update(DeliveryMans deliveryMans);
     DeliveryMans deleteById(Long id);
}
