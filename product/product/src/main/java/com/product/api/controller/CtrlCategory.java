package com.product.api.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.product.api.entity.Category;

@RestController
@RequestMapping("/category") 

public class CtrlCategory {

    @GetMapping
    public ResponseEntity<List<Category>> getCategories(){
        
        Category category1 = new Category(1, "Linea Blanca", "LB", 1);
        Category category2 = new Category(2, "Electronica", "Electr", 1);
        
        List<Category> categories = new ArrayList<Category>();
        categories.add(category1);
        categories.add(category2);

        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
    

    
    @GetMapping("/{category_id}")
    public ResponseEntity<Category> getCategory(@PathVariable int category_id){
        
        Category category1 = new Category(1, "Linea Blanca", "LB", 1);

        return new ResponseEntity<>(category1, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> createCategory(@Valid @RequestBody Category category, BindingResult bindingResult){
        String mensaje = "";

        if(bindingResult.hasErrors()){
           bindingResult.getAllErrors().get(0).getDefaultMessage();
           return new ResponseEntity<>(mensaje, HttpStatus.BAD_REQUEST);
        }
        mensaje = "Category created";
        return new ResponseEntity<>(mensaje, HttpStatus.OK);
    } 

    @PutMapping("/{category_id}")
    public ResponseEntity<String> updateCategory(@PathVariable int category_id, @Valid @RequestBody Category category, BindingResult bindingResult){
        String mensaje = "";
        if(bindingResult.hasErrors()){
            mensaje = bindingResult.getAllErrors().get(0).getDefaultMessage();
            return new ResponseEntity<>(mensaje, HttpStatus.BAD_REQUEST);
        }
        mensaje = "category updated";
        return new ResponseEntity<>(mensaje, HttpStatus.OK);
    }


    @DeleteMapping("/{category_id}")
    public ResponseEntity<String> deleteCategory(@PathVariable int category_id){
        String mensaje = "";
        mensaje = "category removed";
        return new ResponseEntity<>(mensaje, HttpStatus.OK);
    }


}
