package com.mycompany.programaempleados;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FABIAN
 */
public class Empleado {
    private String nombre;
    private double salario;

    // Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Métodos Getter
    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }
}