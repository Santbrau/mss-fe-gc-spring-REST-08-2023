package com.ta34.dto;


public class EmpleadoDTO {
    private Long id;
    private String nombre;
    private String trabajo;
    private double salario;

    
    public EmpleadoDTO() {
    }

    public EmpleadoDTO(Long id, String nombre, String trabajo, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.trabajo = trabajo;
        this.salario = salario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
