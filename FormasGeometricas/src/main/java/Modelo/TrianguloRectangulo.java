/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class TrianguloRectangulo {
    private double base;
    private double altura;

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularHipotenusa() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    public double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    public String determinarTipo() {
        double hipotenusa = calcularHipotenusa();

        if (base == altura && altura == hipotenusa) {
            return "Equilatero";
        } else if (base == altura || base == hipotenusa || altura == hipotenusa) {
            return "Isosceles";
        } else {
            return "Escaleno";
        }
    }
}