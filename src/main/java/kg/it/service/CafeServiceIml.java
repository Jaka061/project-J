package kg.it.service;

import kg.it.entity.Cafe;
import kg.it.repository.CafeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CafeServiceIml implements CafeService {
    @Autowired
    private CafeRepository cafeRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public Cafe getById(Long id) {
        return cafeRepository.findById(id).orElse(null);
    }

    @Override
    public Cafe create(Cafe cafe) {
        String encodePassWord = passwordEncoder.encode(cafe.getPassword());
        cafe.setPassword(encodePassWord);
        return cafeRepository.save(cafe);
    }
    @Override
    public Cafe update(Cafe cafe) {
        return cafeRepository.save(cafe);
    }
    @Override
    public Cafe deleteById(Long id) {
        Cafe cafe = getById(id);
        if (cafe != null) {
            cafeRepository.deleteById(id);
        }
        return null;
    }
    @Override
    public List<Cafe> getAll() {
        return cafeRepository.findAll();
    }
}
