public class contador {

    int valorInicial = 0;
    public int getValorInicial() {
        return valorInicial;
    }

    public int getValorFinal() {
        return valorFinal;
    }

    public int getValorIncremento() {
        return valorIncremento;
    }

    int valorFinal = 0;
    int valorIncremento = 0;


    public contador(int valorInicial, int valorFinal, int valorIncremento) {
        this.valorInicial = 0;
        this.valorIncremento = 1;
        this.valorFinal = valorFinal;
    
    }
    
    public contador(int valorFinal) {
        this.valorInicial = 0;
        this.valorIncremento = 1;
    }

}