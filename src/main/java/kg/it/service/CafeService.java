package kg.it.service;

import kg.it.entity.Cafe;

import java.util.List;

public interface CafeService {
    Cafe getById(Long id);
    Cafe create(Cafe cafe);
    Cafe update(Cafe cafe);
    Cafe deleteById(Long id);
    List<Cafe> getAll();

}
