package com.control.maurban.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "sales")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @NotBlank(message = "O nome do cliente é obrigatório")
    @Column(name = "client_name", nullable = false)
    private String clientName;

    @NotBlank(message = "O valor de compra do produto é obrigatório")
    @Column(name = "purchase_price", nullable = false)
    private double purchasePrice; //Price at which the product was purchased

    @NotBlank(message = "A porcentage encima do valor de compra é obrigatória")
    @Column(name = "percentage", nullable = false)
    private int percentage; //Percentage of purchase price for sale

    //TODO: create the method to calculate and set the sale price
    @NotBlank(message = "O valor de venda é obirgatório")
    @Column(name = "sale_price", nullable = false)
    private double salePrice;

    @NotBlank(message = "A quantidade de parcelas é obrigatória")
    @Column(name = "installments", nullable = false)
    private int installments; //Installments quantity

    //TODO: create the method to calculate and set the installment price
    @NotBlank
    @Column(name = "installment_price", nullable = false)
    private double installmentPrice;

    @NotBlank
    @Column(name = "payed_value", nullable = false)
    private int payedValue; // Amount paid at the time of purchase

    //TODO: create the method to calculate the pending amount
    @NotBlank
    @Column(name = "pending_amount", nullable = false)
    private double pendingAmount; // The amount that still need to receive from the client

    @NotBlank(message = "É necessário indicar se o valor já foi 100% pago ou não")
    @Column(name = "finished", nullable = false)
    private boolean finished; // To check if the client completes payment in full

    @NotBlank
    @Column(name = "sale_date", nullable = false)
    private Date saleDate; // THe date the sale occur


}
