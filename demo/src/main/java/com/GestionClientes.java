package com;

public class GestionClientes {
    private String cedula;
    private String nombre;
    private String preferencias;
    private String plantasAdquiridas;
    private String recordatorio;

    public GestionClientes(String cedula, String nombre, String preferencias, String plantasAdquiridas, String recordatorio){
        this.nombre = cedula;
        this.cedula = nombre;
        this.preferencias = preferencias;
        this.plantasAdquiridas = plantasAdquiridas;
        this.recordatorio = recordatorio;
    }
        public String getCedula() {
            return cedula;
        }
        public void setCedula(String cedula) {
            this.cedula = cedula;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getPreferencias() {
            return preferencias;
        }
        public void setPreferencias(String preferencias) {
            this.preferencias = preferencias;
        }
        public String getPlantasAdquiridas() {
            return plantasAdquiridas;
        }
        public void setPlantasAdquiridas(String plantasAdquiridas) {
            this.plantasAdquiridas = plantasAdquiridas;
        }
        public String getRecordatorio() {
            return recordatorio;
        }
        public void setRecordatorio(String recordatorio) {
            this.recordatorio = recordatorio;
        }
    }