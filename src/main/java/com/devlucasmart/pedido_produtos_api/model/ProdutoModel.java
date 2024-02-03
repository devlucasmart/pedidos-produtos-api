package com.devlucasmart.pedido_produtos_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoModel {

    private Integer id;
    private String descricao;
    private BigDecimal preco;
}
