package com.mds.apppedidos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pedidos-head")
public class PedidoHeadController {

    private final PedidoHeadRepository pedidoHeadRepository;

    @Autowired
    public PedidoHeadController(PedidoHeadRepository pedidoHeadRepository) {
        this.pedidoHeadRepository = pedidoHeadRepository;
    }

    @GetMapping
    public ResponseEntity<List<PedidoHead>> getAllPedidosHead() {
        List<PedidoHead> pedidos = pedidoHeadRepository.findAll();
        return new ResponseEntity<>(pedidos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PedidoHead> getPedidoHeadById(@PathVariable String id) {
        Optional<PedidoHead> pedido = pedidoHeadRepository.findById(id);
        return pedido.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<PedidoHead> createPedidoHead(@RequestBody PedidoHead pedidoHead) {
        PedidoHead nuevoPedido = pedidoHeadRepository.save(pedidoHead);
        return new ResponseEntity<>(nuevoPedido, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PedidoHead> updatePedidoHead(
            @PathVariable String id,
            @RequestBody PedidoHead pedidoHeadActualizado) {

        if (!pedidoHeadRepository.existsById(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        pedidoHeadActualizado.setId(id);
        PedidoHead pedidoActualizado = pedidoHeadRepository.save(pedidoHeadActualizado);
        return new ResponseEntity<>(pedidoActualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePedidoHead(@PathVariable String id) {
        if (!pedidoHeadRepository.existsById(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        pedidoHeadRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}