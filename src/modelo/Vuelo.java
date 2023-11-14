/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author tintaya
 */
public class Vuelo {
    private String codigo;
    private String destino;
    private String horaDespegue;
    private String horaLlegada;
    private int asientosTotal;
    private int asientosDisponible;
    private String costo;
    private String estado;

    public Vuelo(String codigo, String destino, String horaDespegue, String horaLlegada, int asientosTotal, int asientosDisponible, String costo, String estado) {
        this.codigo = codigo;
        this.destino = destino;
        this.horaDespegue = horaDespegue;
        this.horaLlegada = horaLlegada;
        this.asientosTotal = asientosTotal;
        this.asientosDisponible = asientosDisponible;
        this.costo = costo;
        this.estado = estado;
    }

    public Vuelo(String codigo, String destino, String horaDespegue, String horaLlegada, int asientosTotal, String costo, String estado,int cantidad) {
        this.codigo = codigo;
        this.destino = destino;
        this.horaDespegue = horaDespegue;
        this.horaLlegada = horaLlegada;
        this.asientosTotal = asientosTotal;
        this.costo = costo;
        this.estado = estado;
        this.asientosDisponible=asientosTotal-cantidad;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHoraDespegue() {
        return horaDespegue;
    }

    public void setHoraDespegue(String horaDespegue) {
        this.horaDespegue = horaDespegue;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public int getAsientosTotal() {
        return asientosTotal;
    }

    public void setAsientosTotal(int asientosTotal) {
        this.asientosTotal = asientosTotal;
    }

    public int getAsientosDisponible() {
        return asientosDisponible;
    }

    public void setAsientosDisponible(int asientosDisponible) {
        this.asientosDisponible = asientosDisponible;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
