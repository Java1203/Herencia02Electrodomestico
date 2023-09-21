package ejercicio02electrodomestico;

public final class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, String color, char consumo, double peso) {
        super(color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void precioFinalLavadora() {
        double precioFinal = super.getPrecio();
        if (super.getPeso() >= 30) {
            precioFinal += 500;
        }
        super.setPrecio(precioFinal);
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nCarga: " + this.carga;
    }

}
