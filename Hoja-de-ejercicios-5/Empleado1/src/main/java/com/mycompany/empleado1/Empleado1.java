/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empleado1;
import java.util.ArrayList;
/**
 *
 * @author FABIAN
 */
public class Empleado1{
    private String nombre;
    private String departamento;
    private double salario;

    public Empleado1(String nombre, String departamento, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    @Override
    public String toString() {
        return "Empleado1 {nombre='" + nombre + "', departamento='" + departamento + "', salario=" + salario + "}";
    }

    public static ArrayList<Empleado1> filtrarEmpleados(ArrayList<Empleado1> lista, String departamentoBuscado) {
        ArrayList<Empleado1> resultado = new ArrayList<>();
        for (Empleado1 emp : lista) {
            if (emp.getDepartamento().equalsIgnoreCase(departamentoBuscado) && emp.getSalario() > 5000) {
                resultado.add(emp);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        ArrayList<Empleado1> empleados = new ArrayList<>();

        empleados.add(new Empleado1("Carlos", "Ventas", 6000.00));
        empleados.add(new Empleado1("Ana", "Ventas", 4500.00));
        empleados.add(new Empleado1("Luis", "IT", 7500.00));
        empleados.add(new Empleado1("Maria", "Ventas", 5200.00));
        empleados.add(new Empleado1("Pedro", "IT", 4800.00));

        ArrayList<Empleado1> filtroVentas = filtrarEmpleados(empleados, "Ventas");

        System.out.println("Empleados de Ventas con salario mayor a Q5000:");
        for (Empleado1 e : filtroVentas) {
            System.out.println(e);
        }
    }
}