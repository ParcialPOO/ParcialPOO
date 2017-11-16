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
public class Local extends Inmueble {
    
    private boolean enCentroComercial;

    public Local(boolean enCentroComercial, String codigo, int area) {
        super(codigo, area);
        this.enCentroComercial = enCentroComercial;
    }

    public boolean isEnCentroComercial() {
        return enCentroComercial;
    }

    public void setEnCentroComercial(boolean enCentroComercial) {
        this.enCentroComercial = enCentroComercial;
    }

    @Override
    public double calcularArriendo() {
        double arriendo = 10000*super.getArea();
        if (enCentroComercial = false) {
            arriendo = arriendo + 0.2*arriendo;
        }
        return arriendo;
    }
  
}
