package com.JEI.Parapharmacie;

import com.JEI.Parapharmacie.Entities.Product;
import com.JEI.Parapharmacie.Repositories.ProductRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class ParapharmacieApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParapharmacieApplication.class, args);
	}

//	@Bean
//	ApplicationRunner init(ProductRepository repository) {
//		return args -> {
//			Stream.of("Doliprane", "dwe1", "dwe2", "dwe3", "dwe4",
//					"dwe5", "dwe6", "dwe7", "dwe8").forEach(name -> {
//				Product product = new Product();
//				product.setName(name);
//				repository.save(product);
//			});
//			repository.findAll().forEach(System.out::println);
//		};
//	}
}

