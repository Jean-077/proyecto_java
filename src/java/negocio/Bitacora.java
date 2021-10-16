package negocio;

import java.util.Date;

public class Bitacora {
    private int id_Bit,id_Inq;
    private String nom,tipo,mensaje;
    private Date date;

    public Bitacora() {
    }

    public Bitacora(int id_Bit, int id_Inq, String nom, String tipo, String mensaje, Date date) {
        this.id_Bit = id_Bit;
        this.id_Inq = id_Inq;
        this.nom = nom;
        this.tipo = tipo;
        this.mensaje = mensaje;
        this.date = date;
    }

    public int getId_Bit() {
        return id_Bit;
    }

    public void setId_Bit(int id_Bit) {
        this.id_Bit = id_Bit;
    }

    public int getId_Inq() {
        return id_Inq;
    }

    public void setId_Inq(int id_Inq) {
        this.id_Inq = id_Inq;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
