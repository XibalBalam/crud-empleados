package com.umg.empleados.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "u_empleados")
public class UEmpleado {

    @Id
    private String idempleado;

    private String nombre;
    private String direccion;
    private String telefono;
    private String nit;
    private String correo;
    private String dpi;

    @Temporal(TemporalType.DATE)
    private Date finicio;

    @Temporal(TemporalType.DATE)
    private Date ffin;

    private String observaciones;

    @Enumerated(EnumType.STRING)
    private Estatus estatus;

    private String adiciono;

    @Temporal(TemporalType.DATE)
    private Date fecha_adiciono;

    private String modifico;

    @Temporal(TemporalType.DATE)
    private Date fecha_modificacion;

    private Integer rol_id;

    public enum Estatus {
        A, I
    }

    // Getters y setters

    public String getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(String idempleado) {
        this.idempleado = idempleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public Date getFinicio() {
        return finicio;
    }

    public void setFinicio(Date finicio) {
        this.finicio = finicio;
    }

    public Date getFfin() {
        return ffin;
    }

    public void setFfin(Date ffin) {
        this.ffin = ffin;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Estatus getEstatus() {
        return estatus;
    }

    public void setEstatus(Estatus estatus) {
        this.estatus = estatus;
    }

    public String getAdiciono() {
        return adiciono;
    }

    public void setAdiciono(String adiciono) {
        this.adiciono = adiciono;
    }

    public Date getFecha_adiciono() {
        return fecha_adiciono;
    }

    public void setFecha_adiciono(Date fecha_adiciono) {
        this.fecha_adiciono = fecha_adiciono;
    }

    public String getModifico() {
        return modifico;
    }

    public void setModifico(String modifico) {
        this.modifico = modifico;
    }

    public Date getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(Date fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }

    public Integer getRol_id() {
        return rol_id;
    }

    public void setRol_id(Integer rol_id) {
        this.rol_id = rol_id;
    }
}
