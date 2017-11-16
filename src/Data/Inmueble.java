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
public abstract class Inmueble {
    
    private String codigo;
    private int area;

    public Inmueble(String codigo, int area) {
        this.codigo = codigo;
        this.area = area;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    
    abstract public double calcularArriendo();
}
