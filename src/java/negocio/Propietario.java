package negocio;

public class Propietario {
    private int id_pro,tel,edad;
    private String nomPro,nacionPro;

    public Propietario() {
    }

    public Propietario(int id_pro, int tel, int edad, String nomPro, String nacionPro) {
        this.id_pro = id_pro;
        this.tel = tel;
        this.edad = edad;
        this.nomPro = nomPro;
        this.nacionPro = nacionPro;
    }

    public int getId_pro() {
        return id_pro;
    }

    public void setId_pro(int id_pro) {
        this.id_pro = id_pro;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNomPro() {
        return nomPro;
    }

    public void setNomPro(String nomPro) {
        this.nomPro = nomPro;
    }

    public String getNacionPro() {
        return nacionPro;
    }

    public void setNacionPro(String nacionPro) {
        this.nacionPro = nacionPro;
    }
    
}
