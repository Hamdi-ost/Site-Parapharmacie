package com.JEI.Parapharmacie.Controllers;

import com.JEI.Parapharmacie.Entities.Product;
import com.JEI.Parapharmacie.Repositories.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@RestController
public class ProductController {
    private ProductRepository repository ;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping("listProducts")
    public Collection<Product> listProducts(){
        return new ArrayList<>(repository.findAll());
    }

    @GetMapping("listProduct/{id}")
    public Optional<Product> listProductById(@PathVariable("id") Long id){
        return (repository.findById(id)) ;
    }

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return repository.save(product);
    }

    @PutMapping("/updateProduct/{id}")
    public Product updateProduct(@PathVariable(value = "id") Long id,
                           @Valid @RequestBody Product product) {

        Optional<Product> newProduct = repository.findById(id);

        newProduct.get().setCategories(product.getCategories());
        newProduct.get().setCost(product.getCost());
        newProduct.get().setInPromotion(product.isInPromotion());
        newProduct.get().setLongDescription(product.getLongDescription());
        newProduct.get().setName(product.getName());
        newProduct.get().setPicturePath(product.getPicturePath());
        newProduct.get().setPromotionPourcentage(product.getPromotionPourcentage());
        newProduct.get().setShortDescription(product.getShortDescription());

        return repository.save(newProduct.get());
    }

    @DeleteMapping("/deleteProduct/{id}")
    public ResponseEntity<?> deleteproduct(@PathVariable(value = "id") Long id) {
         Optional<Product> product = repository.findById(id);

        repository.delete(product.get());

        return ResponseEntity.ok().build();
    }





}
