package ejercicio02electrodomestico;

import Enums.colorElectrodomestico;
import Enums.consumoEnergetico;

public abstract class Electrodomestico {

    private double precio;
    private String color;
    private char consumo;
    private double peso;
    private final double PRECIOBASE = 1000;

    public Electrodomestico() {
    }

    public Electrodomestico(String color, char consumo, double peso) {
        this.color = comprobarColor(color);
        this.consumo = comprobarConsumoEnergetico(consumo);
        this.peso = peso;
        this.precio = precioFinal();
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private char comprobarConsumoEnergetico(char letra) {
        boolean letraValida = false;

        for (consumoEnergetico aux : consumoEnergetico.values()) {
            if (aux.name().charAt(0) == Character.toUpperCase(letra)) {
                letraValida = true;
                break;
            }
        }
        if (!letraValida) {
            letra = 'F';
        }
        return letra;
    }

    private String comprobarColor(String color) {
        boolean colorValido = false;

        for (colorElectrodomestico aux : colorElectrodomestico.values()) {
            if (aux.name().equalsIgnoreCase(color)) {
                colorValido = true;
                break;
            }
        }
        if (!colorValido) {
            color = "blanco";
        }
        return color;
    }

    private double precioFinal() {
        double precioFinal = PRECIOBASE;
        for (consumoEnergetico i : consumoEnergetico.values()) {
            if (i.toString().charAt(0) == Character.toUpperCase(this.consumo)) {
                precioFinal += (double) i.getValor();
            }
        }

        if (this.peso >= 1 && this.peso <= 19) {
            precioFinal += 100;
        } else if (this.peso >= 20 && this.peso <= 49) {
            precioFinal += 500;
        } else if (this.peso >= 50 && this.peso <= 79) {
            precioFinal += 800;
        } else if (this.peso > 80) {
            precioFinal += 1000;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Precio: " + this.precio
                + "\nColor: " + this.color
                + "\nConsumo: " + this.consumo
                + "\nPeso: " + this.peso;
    }

}
