package com.control.maurban.mappers;

import com.control.maurban.dtos.SaleDTO;
import com.control.maurban.entities.Sale;

public class SaleMapper {

    public static Sale toEntity(SaleDTO dto) {
        try {
            return new Sale(dto.getClientName(), dto.getPurchasePrice(), dto.getPercentage(), dto.getInstallments(), dto.getInitialPayedValue());
        }
        catch(Exception e) {
            //TODO: improve this message registration to a log file
            System.out.println(e.getMessage());
            return null;
        }
    }

}
