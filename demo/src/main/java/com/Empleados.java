package com;

public class Empleados {
    private String Cedula;
    private String N_Empleado;
    public Empleados(String Cedula, String N_Empleado){
        this.Cedula = Cedula;
        this.N_Empleado = N_Empleado;
    }
    public String getCedula() {
        return Cedula;
    }
    public void setCedula(String cedula) {
        this.Cedula = cedula;
    }
    public String getN_Empleado() {
        return N_Empleado;
    }
    public void setN_Empleado(String n_Empleado) {
        this.N_Empleado = n_Empleado;
    }
}
