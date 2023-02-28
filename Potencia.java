public class Potencia {
    private int NumPotencia;
    private int NumExponente;

    public Potencia(int b, int c) {
        this.NumPotencia = b;
        this.NumExponente = c;
    }

    public int calcularPotencia() {
        return calcularPote(NumPotencia, NumExponente);
    }

    private int calcularPote(int b, int c) {
        if (c == 0)
            return 0;
        if (c == 1)
            return b;
        return b * calcularPote(b, c-1);
    }
}
