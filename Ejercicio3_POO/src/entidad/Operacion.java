/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Operacion {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
  
    private int numero1;
    private int numero2;

    
    public Operacion() {
    }

    
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    /*c) Métodos get y set.*/
    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

   
    public void crearOperacion() {
        System.out.println("Ingrese un valor para el Número 1: ");
        this.numero1 = leer.nextInt();
        System.out.println("Ingrese un valor para el Número 2: ");
        this.numero2 = leer.nextInt();
    }

    
    public int sumar() {
        int suma = numero1 + numero2;
        return suma;
    }

    
    public int restar() {
        int resta = numero1 - numero2;
        return resta;
    }

    
    public int multiplicar() {
        int multiplicacion = 0;
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("El número no es válido");
        } else {
            multiplicacion = numero1 * numero2;
        }
        return multiplicacion;
    }
    
    public double dividir(){
        double division = 0;
      if (numero1 == 0 || numero2 == 0) {
            System.out.println("El número no es válido");
        } else {
            division = (double)numero1 / (double)numero2;
        }
        return division;  
    }
}

