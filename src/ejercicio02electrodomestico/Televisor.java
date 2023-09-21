package ejercicio02electrodomestico;

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

    public void precioFinalTelevisor() {
        double precioFinal = super.getPrecio();
        if (this.resolucion > 40) {
            if (this.sintonizador) {
                super.setPrecio((super.getPrecio() * 1.3) + 500);
            } else {
                super.setPrecio((super.getPrecio() * 1.3));
            }
        } else {
            super.setPrecio(super.getPrecio() + 500);
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nResolución: " + this.resolucion
                + "\nSintonizar: " + this.sintonizador;
    }

}
