package com.control.maurban.controllerts;

import com.control.maurban.entities.Sale;
import com.control.maurban.servicies.SaleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
