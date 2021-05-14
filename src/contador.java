public class contador {

    int valorInicial = 0;
    int valorFinal = 0;
    int valorIncremento = 0;
    int valorActual = 0;

    public int getValorActual() {
        return valorActual;
    }

    public int getValorInicial() {
        return valorInicial;
    }

    public int getValorFinal() {
        return valorFinal;
    }

    public int getValorIncremento() {
        return valorIncremento;
    }

    public contador(int valorInicial, int valorFinal, int valorIncremento) {
        this.valorInicial = 0;
        this.valorIncremento = 1;
        this.valorFinal = valorFinal;

    }

    public contador(int valorFinal) {
        this.valorInicial = 0;
        this.valorIncremento = 1;
    }

    public boolean incremento() {
        int valorActual = valorInicial;
        valorActual = valorInicial + valorIncremento;

        if (valorActual > valorFinal) {
            return true;
        } else {
            return false;
        }
    }

}