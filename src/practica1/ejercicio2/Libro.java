/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1.ejercicio2;

/**
 *
 * @author ESTUDIANTE
 */
public class Libro {
    //Atributos
    String titulo;
    String autor;
    int paginas;
    int calificacion;
    
    //Metodos

    public Libro(String titulo, String autor, int paginas, int calificacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
        
}
