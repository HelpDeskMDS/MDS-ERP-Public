package com.mds.apppedidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoHeadRepository extends JpaRepository<PedidoHead, String> {
    // Query methods personalizados pueden agregarse aquí
}