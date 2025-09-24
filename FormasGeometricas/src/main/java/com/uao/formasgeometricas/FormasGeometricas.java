/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uao.FormasGeometricas;

import javax.swing.JOptionPane;
import Modelo.Circulo;
import Modelo.Rectangulo;
import Modelo.Cuadrado;
import Modelo.TrianguloRectangulo;

public class FormasGeometricas {
    public static void main(String[] args) {

        // Circulo
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo:"));
        Circulo c = new Circulo(radio);

        // Rectangulo
        double baseR = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del rectangulo:"));
        double alturaR = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del rectangulo:"));
        Rectangulo r = new Rectangulo(baseR, alturaR);

        // Cuadrado
        double lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado del cuadrado:"));
        Cuadrado q = new Cuadrado(lado);

        // Triangulo rectángulo
        double baseT = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triangulo rectangulo:"));
        double alturaT = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triangulo rectangulo:"));
        TrianguloRectangulo t = new TrianguloRectangulo(baseT, alturaT);

        // Mostrar
        String resultados = "Circulo: \n" +
                "Area: " + c.calcularArea() + "\n" +
                "Perimetro: " + c.calcularPerimetro() + "\n\n" +

                "Rectangulo: \n" +
                "Area: " + r.calcularArea() + "\n" +
                "Perimetro: " + r.calcularPerimetro() + "\n\n" +

                "Cuadrado: \n" +
                "Area: " + q.calcularArea() + "\n" +
                "Perimetro: " + q.calcularPerimetro() + "\n\n" +

                "Triangulo Rectangulo: \n" +
                "Area: " + t.calcularArea() + "\n" +
                "Perimetro: " + t.calcularPerimetro() + "\n" +
                "Hipotenusa: " + t.calcularHipotenusa() + "\n" +
                "Tipo: " + t.determinarTipo();

        JOptionPane.showMessageDialog(null, resultados);
    }
}