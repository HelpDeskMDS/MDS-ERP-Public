package com.mds.apppedidos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pedidos-detail")
public class PedidoDetailController {

    private final PedidoDetailRepository pedidoDetailRepository;

    @Autowired
    public PedidoDetailController(PedidoDetailRepository pedidoDetailRepository) {
        this.pedidoDetailRepository = pedidoDetailRepository;
    }

    @GetMapping
    public ResponseEntity<List<PedidoDetail>> getAllPedidosDetail() {
        List<PedidoDetail> detalles = pedidoDetailRepository.findAll();
        return new ResponseEntity<>(detalles, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PedidoDetail> getPedidoDetailById(@PathVariable String id) {
        Optional<PedidoDetail> detalle = pedidoDetailRepository.findById(id);
        return detalle.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<PedidoDetail> createPedidoDetail(@RequestBody PedidoDetail pedidoDetail) {
        PedidoDetail nuevoDetalle = pedidoDetailRepository.save(pedidoDetail);
        return new ResponseEntity<>(nuevoDetalle, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PedidoDetail> updatePedidoDetail(
            @PathVariable String id,
            @RequestBody PedidoDetail detalleActualizado) {

        if (!pedidoDetailRepository.existsById(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        detalleActualizado.setId(id);
        PedidoDetail detalleActualizadoDB = pedidoDetailRepository.save(detalleActualizado);
        return new ResponseEntity<>(detalleActualizadoDB, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePedidoDetail(@PathVariable String id) {
        if (!pedidoDetailRepository.existsById(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        pedidoDetailRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}