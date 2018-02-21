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
    int n = 0;
    private Libro[] conjunto = new Libro[n];
    
    
    public boolean creaLibro(String titulo, String autor, int paginas, int calificacion){
        
    }
    
    public boolean eliminarLibroTitulo(String titulo){
        return true;
    }
    
    public boolean eliminarLibroAutor(String autor){
        return true;
    }
    
    public Libro[] listarLibros(){
        for(int i=0;i<n;i++){
            System.out.println(+ i+1 +". "+conjunto[i].getTitulo());
        }
        return conjunto;
    }
}
