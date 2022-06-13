package com.sena.microservicesMarilyn.entidades;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Documentos")

public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Codigo_documento")
    private Integer codigo_documento;


    private Integer usuarioID;

    @Column(name = "Fecha_Hora_entrega")
    private java.sql.Timestamp fecha_Hora_entrega;

    @Column(name = "Tipo_documento")
    private String tipo_documento;

    @Column(name = "Estado_documento")
    private String estado_documento;

    @Column(name = "Archivo")
    private String archivo;

    @Override
    public String toString() {
        return "Documento{" +
                "Codigo_documento=" + codigo_documento +
                ", usuarioID=" + usuarioID +
                ", Fecha_Hora_entrega=" + fecha_Hora_entrega +
                ", Tipo_documento='" + tipo_documento + '\'' +
                ", Estado_documento='" + estado_documento + '\'' +
                ", Archivo='" + archivo + '\'' +
                '}';
    }

    public Documento(Integer codigo_documento, Integer usuarioID, Timestamp fecha_Hora_entrega, String tipo_documento, String estado_documento, String archivo) {
        this.codigo_documento = codigo_documento;
        this.usuarioID = usuarioID;
        this.fecha_Hora_entrega = fecha_Hora_entrega;
        this.tipo_documento = tipo_documento;
        this.estado_documento = estado_documento;
        this.archivo = archivo;
    }

    public Documento() {
    }

    public Integer getCodigo_documento() {
        return codigo_documento;
    }

    public void setCodigo_documento(Integer codigo_documento) {
        this.codigo_documento = codigo_documento;
    }

    public Integer getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(Integer usuarioID) {
        this.usuarioID = usuarioID;
    }

    public Timestamp getFecha_Hora_entrega() {
        return fecha_Hora_entrega;
    }

    public void setFecha_Hora_entrega(Timestamp fecha_Hora_entrega) {
        this.fecha_Hora_entrega = fecha_Hora_entrega;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getEstado_documento() {
        return estado_documento;
    }

    public void setEstado_documento(String estado_documento) {
        this.estado_documento = estado_documento;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
}
