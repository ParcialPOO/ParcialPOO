/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author Victor Carrascal - Angie Escobar
 */
public abstract class Vivienda extends Inmueble {
    
    private int numeroAlcobas;

    public Vivienda(int numeroAlcobas, String codigo, int area) {
        super(codigo, area);
        this.numeroAlcobas = numeroAlcobas;
    }

    public int getNumeroAlcobas() {
        return numeroAlcobas;
    }

    public void setNumeroAlcobas(int numeroAlcobas) {
        this.numeroAlcobas = numeroAlcobas;
    }
    
    @Override
    abstract public double calcularArriendo();
    
}
