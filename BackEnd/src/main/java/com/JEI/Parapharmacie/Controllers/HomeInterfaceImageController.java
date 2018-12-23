package com.JEI.Parapharmacie.Controllers;

import com.JEI.Parapharmacie.Entities.HomeInterfaceImage;
import com.JEI.Parapharmacie.Repositories.HomeInterfaceImageRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@RestController
public class HomeInterfaceImageController {
    HomeInterfaceImageRepository repository ;

    public HomeInterfaceImageController(HomeInterfaceImageRepository repository) {
        this.repository = repository;
    }

    @GetMapping("listInterfaceImages")
    public Collection<HomeInterfaceImage> listInterfaceImagess(){
        return new ArrayList<>(repository.findAll());
    }

    @GetMapping("listInterfaceImage/{id}")
    public Optional<HomeInterfaceImage> listInterfaceImageById(@PathVariable("id") Long id){
        return (repository.findById(id)) ;
    }

    @PostMapping("/addInterfaceImage")
    public HomeInterfaceImage addInterfaceImage(@RequestBody HomeInterfaceImage image){
        return repository.save(image);
    }

    @PutMapping("/updateInterfaceImage/{id}")
    public HomeInterfaceImage updateInterfaceImage(@PathVariable(value = "id") Long id,
                                 @Valid @RequestBody HomeInterfaceImage image) {

        Optional<HomeInterfaceImage> newImage = repository.findById(id);

        newImage.get().setImagePath(image.getImagePath());


        return repository.save(newImage.get());
    }

    @DeleteMapping("/deleteInterfaceImage/{id}")
    public ResponseEntity<?> deleteInterfaceImage(@PathVariable(value = "id") Long id) {
        Optional<HomeInterfaceImage> image = repository.findById(id);

        repository.delete(image.get());

        return ResponseEntity.ok().build();
    }
}
