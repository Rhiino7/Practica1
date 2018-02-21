/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class PruebaRectangulo {
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese base ");
        double b = lectura.nextDouble();
        System.out.println("Ingrese altura ");
        double h = lectura.nextDouble();
        Rectangulo rectangulo = new Rectangulo(b,h);
        
        double perimetro = rectangulo.perimetro(b, h);
        
        double area = rectangulo.area(b, h);
        
        System.out.println("Area "+ area + " Perimetro " + perimetro);
    }
}
