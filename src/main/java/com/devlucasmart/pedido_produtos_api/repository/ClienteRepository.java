package com.devlucasmart.pedido_produtos_api.repository;

import com.devlucasmart.pedido_produtos_api.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Integer> {
}
