package kg.it.repository;

import kg.it.entity.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contacts , Long> {
}
