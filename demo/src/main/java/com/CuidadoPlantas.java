package com;

public class CuidadoPlantas {
    private String F_Riego;
    private String F_Abonado;
    private String F_Transplante;
    private String Alerta;
    public CuidadoPlantas(String F_Riego, String F_Abonado, String F_Transplante, String Alerta){
        this.F_Riego = F_Riego;
        this.F_Abonado = F_Abonado;
        this.F_Transplante = F_Transplante;
        this.Alerta = Alerta;
    }
    public String getF_Riego() {
        return F_Riego;
    }
    public void setF_Riego(String f_Riego) {
        this.F_Riego = f_Riego;
    }
    public String getF_Abonado() {
        return F_Abonado;
    }
    public void setF_Abonado(String f_Abonado) {
        this.F_Abonado = f_Abonado;
    }
    public String getF_Transplante() {
        return F_Transplante;
    }
    public void setF_Transplante(String f_Transplante) {
        this.F_Transplante = f_Transplante;
    }
    public String getAlerta() {
        return Alerta;
    }
    public void setAlerta(String alerta) {
        this.Alerta = alerta;
    }
}
