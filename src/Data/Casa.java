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
public class Casa extends Vivienda {
    
    private boolean patio;

    public Casa(boolean patio, int numeroAlcobas, String codigo, int area) {
        super(numeroAlcobas, codigo, area);
        this.patio = patio;
    }

    public boolean isPatio() {
        return patio;
    }

    public void setPatio(boolean patio) {
        this.patio = patio;
    }
    
    @Override
    public double calcularArriendo(){
        double arriendo = 25000*super.getArea();
        if (patio = true){
            arriendo = arriendo + 0.15*arriendo;
        }
        return arriendo;
    }
    
}
