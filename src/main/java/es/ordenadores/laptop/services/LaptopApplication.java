package es.ordenadores.laptop.services;

import es.ordenadores.laptop.entities.Laptop;
import es.ordenadores.laptop.repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class LaptopApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LaptopApplication.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		//CRUD crear Laptops

		Laptop laptop1 = new Laptop(null,"Asus","VivoBook",16, true, LocalDate.of(2023, 10,12),1250.50);
		Laptop laptop2 = new Laptop(null,"Sony","Vaio",8, false, LocalDate.of(2022, 11,21),1050.50);
		Laptop laptop3 = new Laptop(null,"Apple","MacBook",16, true, LocalDate.of(2022, 8,17),1550.50);
		Laptop laptop4 = new Laptop(null,"IBM","BookIBM",32, false, LocalDate.of(2021, 1,12),1678.00);
		Laptop laptop5 = new Laptop(null,"Samsung","Positive",8, true, LocalDate.of(2023, 5,16),1190.50);
		Laptop laptop6 = new Laptop(null,"Microsoft","Flex",16, true, LocalDate.of(2023, 6,23),1250.90);

		System.out.println("Laptops en BBDD: " + repository.findAll().size());
		repository.save(laptop1);
		repository.save(laptop2);
		repository.save(laptop3);
		repository.save(laptop4);
		repository.save(laptop5);
		repository.save(laptop6);
		System.out.println("Laptops en BBDD: " + repository.findAll().size());
	}

}
