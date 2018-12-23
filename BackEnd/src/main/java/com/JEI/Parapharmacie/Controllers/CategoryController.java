package com.JEI.Parapharmacie.Controllers;

import com.JEI.Parapharmacie.Entities.Category;
import com.JEI.Parapharmacie.Repositories.CategoryRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@RestController
public class CategoryController {
    private CategoryRepository repository ;

    public CategoryController(CategoryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("listCategories")
    public Collection<Category> listCategories(){
        return new ArrayList<>(repository.findAll());
    }

    @GetMapping("listCategory/{id}")
    public Optional<Category> listCategoryById(@PathVariable("id") Long id){
        return (repository.findById(id)) ;
    }

    @PostMapping("/addCategory")
    public Category addCategory(@RequestBody Category category){
        return repository.save(category);
    }

    @PutMapping("/updateCategory/{id}")
    public Category updateCategory(@PathVariable(value = "id") Long id,
                                 @Valid @RequestBody Category category) {

        Optional<Category> newCategory = repository.findById(id);

        newCategory.get().setProducts(category.getProducts());
        newCategory.get().setInPromotion(category.isInPromotion());
        newCategory.get().setLongDescription(category.getLongDescription());
        newCategory.get().setName(category.getName());
        newCategory.get().setPromotionPourcentage(category.getPromotionPourcentage());
        newCategory.get().setShortDescription(category.getShortDescription());

        return repository.save(newCategory.get());
    }

    @DeleteMapping("/deleteCategory/{id}")
    public ResponseEntity<?> deleteCategory(@PathVariable(value = "id") Long id) {
        Optional<Category> category = repository.findById(id);

        repository.delete(category.get());

        return ResponseEntity.ok().build();
    }
}
