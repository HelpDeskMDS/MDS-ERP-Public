package com.mds.apppedidos;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "PedidoDetail")
public class PedidoDetail {

    @Id
    @Column(name = "ID", length = 8, nullable = false)
    private String id;

    @Column(name = "TIMESTAMP")
    private LocalDateTime timestamp;

    // Relación Many-to-One con PedidoHead
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDHEAD", referencedColumnName = "ID") // IDHEAD referencia a PedidoHead.ID
    private PedidoHead head;

    @Column(name = "ESTANDAR")
    private Boolean estandar;

    @Column(name = "COD", length = 20)
    private String cod;

    @Column(name = "NOM", length = 200)
    private String nom;

    @Column(name = "CANT")
    private Integer cant;

    @Column(name = "COSTO", precision = 16, scale = 4)
    private BigDecimal costo;

    @Column(name = "DIAS")
    private Integer dias;

    @Column(name = "ENTREGA")
    private LocalDate entrega;

    @Column(name = "SECUENCIA")
    private Integer secuencia;

    @Column(name = "M_EMPLEO", length = 40)
    private String mEmpleo;

    @Column(name = "VALORM", precision = 16, scale = 2)
    private BigDecimal valorm;

    @Column(name = "LINEA", length = 2)
    private String linea;

    @Column(name = "LINEA_NAME", length = 150)
    private String lineaName;

    @Column(name = "TIPICO_NAME", length = 180)
    private String tipicoName;

    @Column(name = "INICOD", length = 4)
    private String inicod;

    @Column(name = "IF_CORREO")
    private Boolean ifCorreo;

    @Column(name = "IF_UNDEMP")
    private Boolean ifUndemp;

    @Column(name = "IDPEDIDOS")
    private Integer idpedidos;

    // Constructor, Getters y Setters


    public PedidoDetail() {
    }

    public PedidoDetail(String id, LocalDateTime timestamp, PedidoHead head, Boolean estandar, String cod, String nom, Integer cant, BigDecimal costo, Integer dias, LocalDate entrega, Integer secuencia, String mEmpleo, BigDecimal valorm, String linea, String lineaName, String tipicoName, String inicod, Boolean ifCorreo, Boolean ifUndemp, Integer idpedidos) {
        this.id = id;
        this.timestamp = timestamp;
        this.head = head;
        this.estandar = estandar;
        this.cod = cod;
        this.nom = nom;
        this.cant = cant;
        this.costo = costo;
        this.dias = dias;
        this.entrega = entrega;
        this.secuencia = secuencia;
        this.mEmpleo = mEmpleo;
        this.valorm = valorm;
        this.linea = linea;
        this.lineaName = lineaName;
        this.tipicoName = tipicoName;
        this.inicod = inicod;
        this.ifCorreo = ifCorreo;
        this.ifUndemp = ifUndemp;
        this.idpedidos = idpedidos;
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

    public PedidoHead getHead() {
        return head;
    }

    public void setHead(PedidoHead head) {
        this.head = head;
    }

    public Boolean getEstandar() {
        return estandar;
    }

    public void setEstandar(Boolean estandar) {
        this.estandar = estandar;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getCant() {
        return cant;
    }

    public void setCant(Integer cant) {
        this.cant = cant;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    public LocalDate getEntrega() {
        return entrega;
    }

    public void setEntrega(LocalDate entrega) {
        this.entrega = entrega;
    }

    public Integer getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Integer secuencia) {
        this.secuencia = secuencia;
    }

    public String getmEmpleo() {
        return mEmpleo;
    }

    public void setmEmpleo(String mEmpleo) {
        this.mEmpleo = mEmpleo;
    }

    public BigDecimal getValorm() {
        return valorm;
    }

    public void setValorm(BigDecimal valorm) {
        this.valorm = valorm;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getLineaName() {
        return lineaName;
    }

    public void setLineaName(String lineaName) {
        this.lineaName = lineaName;
    }

    public String getTipicoName() {
        return tipicoName;
    }

    public void setTipicoName(String tipicoName) {
        this.tipicoName = tipicoName;
    }

    public String getInicod() {
        return inicod;
    }

    public void setInicod(String inicod) {
        this.inicod = inicod;
    }

    public Boolean getIfCorreo() {
        return ifCorreo;
    }

    public void setIfCorreo(Boolean ifCorreo) {
        this.ifCorreo = ifCorreo;
    }

    public Boolean getIfUndemp() {
        return ifUndemp;
    }

    public void setIfUndemp(Boolean ifUndemp) {
        this.ifUndemp = ifUndemp;
    }

    public Integer getIdpedidos() {
        return idpedidos;
    }

    public void setIdpedidos(Integer idpedidos) {
        this.idpedidos = idpedidos;
    }
}