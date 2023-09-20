package Enums;

public enum consumoEnergetico {
    A(1000),
    B(800),
    C(600),
    D(500),
    E(300),
    F(100);

    private final int valor;

    consumoEnergetico(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
