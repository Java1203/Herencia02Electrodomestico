package ejercicio02electrodomestico;

public final class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, String color, char consumo, double peso) {
        super(color, consumo, peso);
        this.carga = carga;
        //this.precio = precioFinal();
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

//    @Override
//    public void crearElectrodomestico() {
//        Scanner leer = new Scanner(System.in);
//        System.out.println("Cual es el color de la lavadora?");
//        super.color = leer.nextLine();
//        System.out.println("Cual es el consumo?");
//        super.consumo = leer.next().charAt(0);
//        System.out.println("Cual es el peso?");
//        super.peso = leer.nextDouble();
//        System.out.println("Cual es la carga?");
//        this.carga = leer.nextInt();
//        leer.nextLine();
//
//        if (super.peso >= 30) {
//            super.precio = super.getPrecio() + 500;
//        }
//    }
    @Override
    protected double precioFinal() {
        double precioFinalLavadora = super.precioFinal();
        if (super.getPeso() >= 30) {
            precioFinalLavadora += 500;
        }
        return precioFinalLavadora;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nCarga: " + this.carga;
    }

}
