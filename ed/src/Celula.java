public class Celula {
    private Object elemento;
    private Celula proximo;

    // construtor
    public Celula(Object elemento, Celula proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    // getters and setters
    public Celula getProximo() {
        return proximo;
    }
    public void setProximo(Celula Proximo){
        this.proximo = proximo;
    }

    public Object getElemento(){
        return elemento;
    }
}
