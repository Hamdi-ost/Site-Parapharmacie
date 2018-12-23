package com.JEI.Parapharmacie.Repositories;

import com.JEI.Parapharmacie.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
