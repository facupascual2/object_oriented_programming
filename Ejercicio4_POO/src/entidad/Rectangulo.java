
package entidad;

import java.util.Scanner;


public class Rectangulo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
  
    private double base;
    private double altura;


    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }


    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    public void crearRectangulo() {
        System.out.println("Ingrese la base del Rectángulo: ");
        this.base = leer.nextDouble();
        System.out.println("Ingrese la altura del Rectángulo: ");
        this.altura = leer.nextDouble();
    }

   
    public double superficie() {
        double sup = (base * altura) / 2;
        return sup;
    }

   
    public double perimetro() {
        double per = (base + altura) * 2;
        return per;
    }

  
    public void dibujarRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("  ");;
        }
    }
}
