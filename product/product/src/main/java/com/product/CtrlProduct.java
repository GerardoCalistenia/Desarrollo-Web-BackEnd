package com.product;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CtrlProduct{

    @GetMapping("/category")
    public ArrayList<Category> show(){
        ArrayList<Category> lista = new ArrayList<>();
        lista.add(new Category(1, "Linea Blanca", "LB"));
		lista.add(new Category(2, "Lácteos", "Lc"));
		lista.add(new Category(3, "Farmacia", "Fc"));
        return lista;
    }
}
