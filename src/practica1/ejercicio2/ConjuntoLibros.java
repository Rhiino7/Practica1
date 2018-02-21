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
public class ConjuntoLibros {
    private Libro[] libros[]; 
    
    public ConjuntoLibros(){
        this.libros = new Libro[10];
    }
    
    public boolean creaLibro(String titulo, String autor, int paginas, int calificacion){
        return true;
    }
    
    public boolean eliminarLibroTitulo(String titulo){
        return true;
    }
    
    public boolean eliminarLibroAutor(String autor){
        return true;
    }
    
    public Libro[] listarLibros(){
        for(int i=0;i<n;i++){
            System.out.println(+ i+1 +". "+libros[i].getTitulo());
        }
        return libros;
    }
}
