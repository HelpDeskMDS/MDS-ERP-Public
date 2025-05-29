package com.mds.apppedidos;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PedidoHead")
public class PedidoHead {

    @Id
    @Column(name = "ID", length = 8, nullable = false)
    private String id;

    @Column(name = "TIMESTAMP")
    private LocalDateTime timestamp;

    @Column(name = "ESTANDAR")
    private Boolean estandar;

    @Column(name = "DESTINAT", length = 15)
    private String destinat;

    @Column(name = "TDESPACHO", length = 250)
    private String tdespacho;

    @Column(name = "CLIENTE", length = 15)
    private String cliente;

    @Column(name = "FECHA")
    private LocalDate fecha;

    @Column(name = "VENDEDOR", length = 5)
    private String vendedor;

    @Column(name = "ORDEN", length = 50)
    private String orden;

    @Lob
    @Column(name = "DETALLE")
    private String detalle;

    @Column(name = "URGENTE", length = 2)
    private String urgente;

    @Column(name = "VENDEDOR_NAME", length = 30)
    private String vendedorName;

    @Column(name = "URGENT_NAME", length = 16)
    private String urgentName;

    @Column(name = "MAIL", length = 60)
    private String mail;

    @Column(name = "NOM_DIR", length = 350)
    private String nomDir;

    @Column(name = "INFACTORY")
    private Boolean infactory;

    @Column(name = "[USER]", length = 60)
    private String user;

    @Column(name = "ENTREGA")
    private LocalDate entrega;

    @Column(name = "PEDIDO", length = 7)
    private String pedido;

    @Column(name = "URL_PEDIDO", length = 250)
    private String urlPedido;

    @Column(name = "USER_FACTORY", length = 10)
    private String userFactory;

    @Column(name = "TOTAL", precision = 16, scale = 4)
    private BigDecimal total;

    @Column(name = "URL_DOWN", length = 250)
    private String urlDown;

    @OneToMany(mappedBy = "head", cascade = CascadeType.ALL, orphanRemoval = true)
   private List<PedidoDetail> detalles;

    // Constructor, Getters y Setters

    public PedidoHead() {
    }

    public PedidoHead(String id, LocalDateTime timestamp, Boolean estandar, String destinat, String tdespacho, String cliente, LocalDate fecha, String vendedor, String orden, String detalle, String urgente, String vendedorName, String urgentName, String mail, String nomDir, Boolean infactory, String user, LocalDate entrega, String pedido, String urlPedido, String userFactory, BigDecimal total, String urlDown) {
        this.id = id;
        this.timestamp = timestamp;
        this.estandar = estandar;
        this.destinat = destinat;
        this.tdespacho = tdespacho;
        this.cliente = cliente;
        this.fecha = fecha;
        this.vendedor = vendedor;
        this.orden = orden;
        this.detalle = detalle;
        this.urgente = urgente;
        this.vendedorName = vendedorName;
        this.urgentName = urgentName;
        this.mail = mail;
        this.nomDir = nomDir;
        this.infactory = infactory;
        this.user = user;
        this.entrega = entrega;
        this.pedido = pedido;
        this.urlPedido = urlPedido;
        this.userFactory = userFactory;
        this.total = total;
        this.urlDown = urlDown;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Boolean getEstandar() {
        return estandar;
    }

    public void setEstandar(Boolean estandar) {
        this.estandar = estandar;
    }

    public String getDestinat() {
        return destinat;
    }

    public void setDestinat(String destinat) {
        this.destinat = destinat;
    }

    public String getTdespacho() {
        return tdespacho;
    }

    public void setTdespacho(String tdespacho) {
        this.tdespacho = tdespacho;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getUrgente() {
        return urgente;
    }

    public void setUrgente(String urgente) {
        this.urgente = urgente;
    }

    public String getVendedorName() {
        return vendedorName;
    }

    public void setVendedorName(String vendedorName) {
        this.vendedorName = vendedorName;
    }

    public String getUrgentName() {
        return urgentName;
    }

    public void setUrgentName(String urgentName) {
        this.urgentName = urgentName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNomDir() {
        return nomDir;
    }

    public void setNomDir(String nomDir) {
        this.nomDir = nomDir;
    }

    public Boolean getInfactory() {
        return infactory;
    }

    public void setInfactory(Boolean infactory) {
        this.infactory = infactory;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public LocalDate getEntrega() {
        return entrega;
    }

    public void setEntrega(LocalDate entrega) {
        this.entrega = entrega;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public String getUrlPedido() {
        return urlPedido;
    }

    public void setUrlPedido(String urlPedido) {
        this.urlPedido = urlPedido;
    }

    public String getUserFactory() {
        return userFactory;
    }

    public void setUserFactory(String userFactory) {
        this.userFactory = userFactory;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getUrlDown() {
        return urlDown;
    }

    public void setUrlDown(String urlDown) {
        this.urlDown = urlDown;
    }

   public List<PedidoDetail> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<PedidoDetail> detalles) {
        this.detalles = detalles;
    }
}