package com;

public class RegistroPlantas {
    private String N_Comun;
    private String N_Cientifico;
    private String Tipo;
    private String A_Info;
    private String E_Info;
   
    public RegistroPlantas(String N_Comun, String N_Cientifico, String Tipo, String A_Info, String E_Info){
        this.N_Comun = N_Comun;
        this.N_Cientifico = N_Cientifico;
        this.Tipo = Tipo;
        this.A_Info = A_Info;
        this.E_Info =E_Info;
    }
    public String getN_Comun() {
        return N_Comun;
    }
    public void setN_Comun(String n_Comun) {
        this.N_Comun = n_Comun;
    }
    public String getN_Cientifico() {
        return N_Cientifico;
    }
    public void setN_Cientifico(String n_Cientifico) {
        this.N_Cientifico = n_Cientifico;
    }
    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }
    public String getA_Info() {
        return A_Info;
    }
    public void setA_Info(String a_Info) {
        this.A_Info = a_Info;
    }
    public String getE_Info() {
        return E_Info;
    }
    public void setE_Info(String e_Info) {
        this.E_Info = e_Info;
    }
}