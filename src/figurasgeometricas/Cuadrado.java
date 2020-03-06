/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author Camila Urueña
 * @author Harold Gomez
 * Clase Cuadrado hija de Perimetro
 */
public class Cuadrado extends Perimetro implements Figura{
    private String tipo;
    private int lado1;
    private int lado2;

    /**
     * Constructor de la clase 
     * @param lado1, representa uno de los lados del cuadrado
     * @param lado2, representa otro de los lados del cuadrado
     */
    public Cuadrado(int lado1, int lado2) {       
        this.lado1 = lado1;
        this.lado2 = lado2;
        if(lado1==lado2){
            this.tipo = "Cuadrado";
        }else{
            this.tipo = "Rectangulo";
        }
    }
    /**
     * Este metodo retorna el tipo si es cuadrado o rectangulo
     * @return tipo
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * Metodo que asigan el valor de tipo
     * @param tipo segun si es cuadrado o rectangulo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * Este metodo retorna el valor de uno de los lados
     * @return el valor de uno de los lados
     */
    public int getLado1() {
        return lado1;
    }
    /**
     * Este metodo asigna el valor para uno de los lados
     * @param lado1 contiene el valor de uno de sus lados
     */
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }
    /**
     * Este metodo retorna el valor de uno de los lados
     * @return el valor de uno de los lados
     */
    public int getLado2() {
        return lado2;
    }
    /**
     * Este metodo asigna el valor para uno de los lados
     * @param lado2 contiene el valor de uno de sus lados
     */
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    /**
     * Este metodo es abstracto de Perimetro, se encarga de hallar el perimetro
     * @return perimetro
     */
    @Override
    public double hallarPerimetro() {
        return (2*lado1+2*lado2);
    }
    /**
     * Este metodo es abstracto de la interface Figura, se encarga de hallar el area
     * @return area
     */
    @Override
    public double hallarArea() {
         return lado1*lado2;
    }
    /**
     * Este metodo es abstracto de la interface Figuras, se encarga de imprimir los resultados hallados
     */
    @Override
    public void imprimirResultados() {
        System.out.println("El area del "+tipo+" es: "+hallarArea());
        System.out.println("El perimetro del "+tipo+" es: "+hallarPerimetro());
    }
    
}