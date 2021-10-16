/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author Adrian
 */
public class Departamento {
    private String id_Dep,estado,distrito;
    private int doDep,baDep,id_Pro;
    private double monto,area;

    public Departamento() {
    }

    public Departamento(String id_Dep, String estado, String distrito, int doDep, int baDep, int id_Pro, double monto, double area) {
        this.id_Dep = id_Dep;
        this.estado = estado;
        this.distrito = distrito;
        this.doDep = doDep;
        this.baDep = baDep;
        this.id_Pro = id_Pro;
        this.monto = monto;
        this.area = area;
    }

    public String getId_Dep() {
        return id_Dep;
    }

    public void setId_Dep(String id_Dep) {
        this.id_Dep = id_Dep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public int getDoDep() {
        return doDep;
    }

    public void setDoDep(int doDep) {
        this.doDep = doDep;
    }

    public int getBaDep() {
        return baDep;
    }

    public void setBaDep(int baDep) {
        this.baDep = baDep;
    }

    public int getId_Pro() {
        return id_Pro;
    }

    public void setId_Pro(int id_Pro) {
        this.id_Pro = id_Pro;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }


}
