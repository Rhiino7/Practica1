/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author ESTUDIANTE
 */
public class Rectangulo {
    //Atributos
    private double base;
    private double altura;
    private double perimetro;
    private double area;
    

    //Metodos
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }    

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public double perimetro(double b, double h){
        double p = 2*h+2*b;
        setPerimetro(p);
        return p;
    }
    
    public double area(double b, double h){
        double a = h*b;
        setArea(a);
        return a;
    }
}
