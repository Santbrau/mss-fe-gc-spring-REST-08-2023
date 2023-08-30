package com.ta34.model;

public enum Trabajo {
    METRE(2000),
    CAMARERO(1200),
    COCINERO(1700),
    PINCHE(1300),
    GERENTE(3500);

    private final double salario;

    Trabajo(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}
