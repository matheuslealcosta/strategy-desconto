package padroescomportamentais.strategy;

public class Compra {

    private float valor;
    private float total;

    public Compra(float valor) {
        this.valor = valor;
        this.total = valor;
    }

    public float getTotal() {
        return total;
    }

    public void aplicarDesconto(Desconto desconto) {
        this.total = desconto.calcular(this.valor);
    }
}
