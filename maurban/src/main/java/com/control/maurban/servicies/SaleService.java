package com.control.maurban.servicies;

import com.control.maurban.entities.Sale;
import com.control.maurban.repositories.SaleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SaleService {

    private final SaleRepository repository;

    public List<Sale> allSales() {
        return repository.findAll();
    }
}
