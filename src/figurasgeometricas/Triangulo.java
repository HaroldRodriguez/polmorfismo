    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * En esta clase se determina el area y perimetro del triangulo
 * @author Camila Urueña
 * @author Harold Gomez
 */
public final class Triangulo extends Perimetro implements Figura{
    /**
     * lado1, lado2,lado3 son dimensiones del triangulo
     * tipo, variable para determinar el tipo de triangulo segun el tamaño de sus lados
     */
    private  int lado1;
    private  int lado2;
    private  int lado3;
    private  String tipo;
    /**
     * Constructor de la clase
     * @param lado1 longitud
     * @param lado2 longitud
     * @param lado3 longitud
     */
    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.tipo=tipoTriangulo(lado1, lado2, lado3);
    }

    /**
     * Determina el tipo de triangulo segun la longitud de sus lados
     * @param lado1 longitud
     * @param lado2 longitud
     * @param lado3 longitud
     * @return tipo de triangulo
     */
    public String tipoTriangulo(int lado1, int lado2, int lado3){
       if(lado1==lado2 & lado1==lado3 & lado2==lado3){
           return "Equilatero";
       }else if(lado1== lado2 || lado2==lado3 || lado1==lado3){
           return "Isosceles";
       }else{
           return "Escaleno";
       }
    }
     /**
     * Este metodo retorna la longitud de uno de los lados del triangulo
     * @return la longitud de uno de los lados
     */
     
    public int getLado1() {
        return lado1;
    }
    /**
     * Asigna el valor de uno de los lados
     * @param lado1 longitud
     */
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }
     /**
     * Este metodo retorna la longitud de uno de los lados del triangulo
     * @return la longitud de uno de los lados
     */
    public int getLado2() {
        return lado2;
    }
     /**
     * Asigna el valor de uno de los lados
     * @param lado2 longitud
     */
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
     /**
     * Este metodo retorna la longitud de uno de los lados del triangulo
     * @return la longitud de uno de los lados
     */
    public int getLado3() {
        return lado3;
    }
     /**
     * Asigna el valor de uno de los lados
     * @param lado3 longitud
     */
    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
     /**
     * Este metodo retorna el tipo de triangulo
     * @return el tipo
     */
    public String getTipo() {
        return tipo;
    }
     /**
     * Asigna el tipo de lado
     * @param tipo de triangulo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     *Este metodo es abstracto de la clase Figura2D, se encarga de hallar el perimetro
     * @return area
     */
    @Override
    public double hallarPerimetro() {
        return lado1+lado2+lado3;
    }
    /**
     *  Este metodo es abstracto de la interface Figura, se encarga de hallar el area segun el tipo de triangulo
     * @return area
     */
    @Override
    public double hallarArea() {
        double semiPerimetro,aux;
        if(null != tipo)switch (tipo) {
            case "Equilatero":
                return sqrt(3)*pow(lado1,2)/4;
            default:
                semiPerimetro=(double)(lado1+lado2+lado3)/2;
                aux=(double)semiPerimetro*(semiPerimetro-lado1)*(semiPerimetro-lado2)*(semiPerimetro-lado3);
                return sqrt(aux);
        }
        return 0;
    }
    /**
     * Este metodo es abstracto de la interface Figuras, se encarga de imprimir los resultados hallados
     */
    @Override
    public void imprimirResultados() {
        System.out.println("El tipo de triangulo es "+tipo);
        System.out.println("El area del triangulo "+tipo+" es "+hallarArea());
        System.out.println("El perimetro del triangulo "+tipo+" es "+hallarPerimetro());
    }
    
}

