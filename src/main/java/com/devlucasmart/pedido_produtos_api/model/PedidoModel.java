package com.devlucasmart.pedido_produtos_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PedidoModel {
    private Integer id;
    private ClienteModel cliente;
    private LocalDate dataPedido;
    private BigDecimal total;
}
