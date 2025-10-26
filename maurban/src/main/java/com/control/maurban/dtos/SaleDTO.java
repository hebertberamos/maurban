package com.control.maurban.dtos;

import lombok.Getter;

import java.util.Date;

@Getter
public class SaleDTO {

    private String clientName;
    private double purchasePrice;
    private int percentage;
    private int installments;
    private int initialPayedValue;
    private boolean finished;
    private Date saleDate;

}
