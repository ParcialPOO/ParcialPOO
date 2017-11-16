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
public class Bodega extends Inmueble {
    
    private int capacidad;

    public Bodega(int capacidad, String codigo, int area) {
        super(codigo, area);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public double calcularArriendo() {
        double arriendo = 5000*capacidad;
        return arriendo;
    }
    
}
