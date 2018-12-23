package com.JEI.Parapharmacie.Controllers;

import com.JEI.Parapharmacie.Entities.HomeInterfaceProduct;
import com.JEI.Parapharmacie.Repositories.HomeInterfaceProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@RestController
public class HomeInterfaceProductsController {
    HomeInterfaceProductRepository repository ;

    public HomeInterfaceProductsController(HomeInterfaceProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping("listInterfaceProducts")
    public Collection<HomeInterfaceProduct> listInterfaceProducts(){
        return new ArrayList<>(repository.findAll());
    }

    @GetMapping("listInterfaceProduct/{id}")
    public Optional<HomeInterfaceProduct> listInterfaceProductById(@PathVariable("id") Long id){
        return (repository.findById(id)) ;
    }

    @PostMapping("/addInterfaceProduct")
    public HomeInterfaceProduct addInterfaceProduct(@RequestBody HomeInterfaceProduct product){
        return repository.save(product);
    }

    @PutMapping("/updateInterfaceProduct/{id}")
    public HomeInterfaceProduct updateInterfaceProduct(@PathVariable(value = "id") Long id,
                                                   @Valid @RequestBody HomeInterfaceProduct product) {

        Optional<HomeInterfaceProduct> newProduct = repository.findById(id);

        newProduct.get().setProduct(product.getProduct());


        return repository.save(newProduct.get());
    }

    @DeleteMapping("/deleteInterfaceProduct/{id}")
    public ResponseEntity<?> deleteInterfaceProduct(@PathVariable(value = "id") Long id) {
        Optional<HomeInterfaceProduct> product = repository.findById(id);

        repository.delete(product.get());

        return ResponseEntity.ok().build();
    }
}
