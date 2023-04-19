/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea01;

/**
 *
 * @author Ruben Condoy
 */
public class Jugador {
    
    public Jugador(String id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public void setCedula(String cedula){
       this.id = id;
    }
    public void setNombre(String nombre){
       this.nombre = nombre;
    }
    public void setApellido(String apellido){
       this.apellido = apellido;
    }
    public void setEdad(int edad){
       this.edad = edad;
    }
    
    public String getCedula(){
       return id;
    }
    public String getNombre(){
       return nombre;
    }
    public String getApellido(){
       return apellido;
    }
    public int getEdad(){
       return edad;
    }
    
    private String id;
    private String nombre;
    private String apellido;
    private int edad;
    
    public void caminar(){
        System.out.println("Hola " + nombre +" está caminando ");
    }
    
    public void correr(){
        System.out.println("Hola " + nombre +" está corriendo ");
    }
    
    public void viajar(){
        System.out.println("Hola " + nombre +" está viajando por el mundo ");
    }
    
}
