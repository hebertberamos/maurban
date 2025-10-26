package com.control.maurban.servicies;

import com.control.maurban.dtos.SaleDTO;
import com.control.maurban.entities.Sale;
import com.control.maurban.mappers.SaleMapper;
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

    public String save(SaleDTO dto) throws Exception {

        try {
            Sale saleEntity = SaleMapper.toEntity(dto);

            if (saleEntity == null) {
                throw new Exception("O objeto da compra está vindo nulo. Método sale da classe SaleService");
            }

            repository.save(saleEntity);
            return "Nova venda salva com suvesso!";
        } catch(Exception e) {
            //TODO: improve this message registration to a log file
            System.out.println(e.getMessage());
            return "Erro ao salvar nova compra.";

        }
    }
}
