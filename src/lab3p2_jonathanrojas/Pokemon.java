/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_jonathanrojas;

/**
 *
 * @author Teitan
 */
public class Pokemon {
    private int numeroPokedex;
    private String nombre;
    private String tipo;
    private int nivel;
    private double puntosSalud;
    private boolean capturado;

    public Pokemon(int numeroPokedex, String nombre, String tipo, int nivel, double puntosSalud, boolean capturado) {
        this.numeroPokedex = numeroPokedex;
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.puntosSalud = puntosSalud;
        this.capturado = capturado;
    }

    public int getNumeroPokedex() {
        return numeroPokedex;
    }

    public void setNumeroPokedex(int numeroPokedex) {
        this.numeroPokedex = numeroPokedex;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getPuntosSalud() {
        return puntosSalud;
    }

    public void setPuntosSalud(double puntosSalud) {
        this.puntosSalud = puntosSalud;
    }

    public boolean isCapturado() {
        return capturado;
    }

    public void setCapturado(boolean capturado) {
        this.capturado = capturado;
    }

    @Override
    public String toString() {
        return "Pokemon :" + "numeroPokedex=" + numeroPokedex + ", nombre=" + nombre + ", tipo=" + tipo + ", nivel=" + nivel + ", puntosSalud=" + puntosSalud + ", capturado=" + capturado + '.';
    }
    public String evaluarPoder(){
        if(nivel<=20){
            return "principiante";
        }else if(nivel<=50){
            return "intermedio";
        }else{
            return "elite";
            
        }
    }// fin de el evaluar
    
}
