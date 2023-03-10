package Ejercicio6;

/**
 * Ejercicio 6. Construir un programa para trabajar con 2 números completos, implemente el siguiente menú: 
 * 1. Sumar dos números complejos
 * 2. Multiplicar dos números complejos
 * 3. Comparar 2 números complejos (iguales o no)
 * 4. Multiplicar un número complejo por un entero
 */
public class NumeroComplejo {
    // Ejemplo: 3 + 4i
    
    private double a;   // Parte real
    private double b;   // Parte imaginaria

    // Método constructor
    public NumeroComplejo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
       
    /*
        Cómo se suman números complejos
        numero1 = 3 + 4i
        numero2 = 2 + 5i
        
        suma = 5 + 9i

        NumeroComplejo numero 1 = new NumeroComplejo (3, 4);
        numero1.calcularSuma(numero2);
    */

    public NumeroComplejo calcularSuma(NumeroComplejo c) {
        NumeroComplejo suma = new NumeroComplejo(a + c.getA(), b + c.getB());
        return suma;
    }

    /*
        Cómo multiplicar un número complejo
        numero1 = 3 + 4i
        numero2 = 2 + 5i

        mult = (3 * 2 - 4 * 5) + (3 * 5 - 4 * 2)i
    */
    public NumeroComplejo calcularProducto(NumeroComplejo c) {
        NumeroComplejo mult = new NumeroComplejo((a * c.getA() - b * c.getB()), (a * c.getB() + b * c.getA()));
        return mult;
    }

    /*
        Cómo comparar dos números complejos
        numero1 = 3 + 4i    Únicamente verificar que los números no sean los mismos
        numero2 = 2 + 5i
    */
    public boolean comprobarIgualdad(NumeroComplejo c) {
        boolean igualdad = false;
        if (a == c.getA() && b == c.getB()) {
            igualdad = true;
        }
        return igualdad;
    }

    /*
        Cómo multiplicar un número complejo por un entero
        numeroComplejo = 3 + 4i
        entero = 2

        mult = 6 + 8i
    */
    public NumeroComplejo multiplicarPorEntero(int x) {
        NumeroComplejo mult = new NumeroComplejo(a * x, b * x);
        return mult;
    }
}