package ejercicio02electrodomestico;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class Televisor extends Electrodomestico {

    private double resolucion;
    private boolean sintonizador;

    public Televisor() {

    }

    public Televisor(double resolucion, boolean sintonizador, String color, char consumo, double peso) {
        super(color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

//    @Override
//    public void crearElectrodomestico() {
//        Scanner leer = new Scanner(System.in);
//
//        System.out.println("Cual es el color del televisor?");
//        super.color = leer.nextLine();
//        System.out.println("Cual es el consumo?");
//        super.consumo = leer.next().charAt(0);
//        System.out.println("Cual es el peso?");
//        super.peso = leer.nextDouble();
//        System.out.println("Cual es la resolución?");
//        this.resolucion = leer.nextDouble();
//        System.out.println("El televisor tiene sintonizador? (true/false)");
//        try {
//            this.sintonizador = leer.nextBoolean();
//        } catch (InputMismatchException ex) {
//            System.out.println("ERROR: " + ex.getMessage());
//        } finally {
//            leer.close();
//        }
//
//        if (this.resolucion > 40) {
//            if (this.sintonizador) {
//                super.precio = (super.getPrecio() * 1.3) + 500;
//            } else {
//                super.precio = (super.getPrecio() * 1.3);
//            }
//        } else {
//            super.precio = super.getPrecio() + 500;
//        }
//
//    }

    @Override
    public String toString() {
        return super.toString()
                + "\nResolución: " + this.resolucion
                + "\nSintonizar: " + this.sintonizador;
    }

}
