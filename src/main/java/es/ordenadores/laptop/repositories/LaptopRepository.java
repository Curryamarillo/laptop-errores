package es.ordenadores.laptop.repositories;

import es.ordenadores.laptop.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}
