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
public class Apartamento extends Vivienda {
    
    private int piso;

    public Apartamento(int piso, int numeroAlcobas, String codigo, int area) {
        super(numeroAlcobas, codigo, area);
        this.piso = piso;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }
      
    @Override
    public double calcularArriendo(){
        double arriendo = 20000*super.getArea();
        if (piso != 1){
            arriendo = arriendo + 0.15*arriendo;
        }
        return arriendo;  
    } 
}
