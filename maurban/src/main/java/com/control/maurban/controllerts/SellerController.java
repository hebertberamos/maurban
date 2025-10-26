package com.control.maurban.controllerts;

import com.control.maurban.dtos.SaleDTO;
import com.control.maurban.entities.Sale;
import com.control.maurban.servicies.SaleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sales")
@RequiredArgsConstructor
public class SellerController {

    private final SaleService service;

    @GetMapping
    public ResponseEntity<List<Sale>> all() {
        List<Sale> allSales = service.allSales();
        return ResponseEntity.ok(allSales);
    }

    //TODO: add the method of create a new sale
    @PostMapping
    public ResponseEntity<String> save(@RequestBody SaleDTO dtoBody) {
        String response = null;
        try{
            response = service.save(dtoBody);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            System.out.println("Exceção da classe controller da entidade Sale, ao salvar uma nova venda");
            return ResponseEntity.badRequest().body(response);
        }
    }
    //TODO: create the method to get a sale by the client name.
    //TODO:
}
