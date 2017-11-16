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
public class Oficina extends Inmueble {
    
    private int parqueaderos;

    public Oficina(int parqueaderos, String codigo, int area) {
        super(codigo, area);
        this.parqueaderos = parqueaderos;
    }

    public int getParqueaderos() {
        return parqueaderos;
    }

    public void setParqueaderos(int parqueaderos) {
        this.parqueaderos = parqueaderos;
    }
    
    @Override
    public double calcularArriendo(){
        double arriendo = 50000*super.getArea() + 100000*parqueaderos;
        return arriendo;
    }
    
}
