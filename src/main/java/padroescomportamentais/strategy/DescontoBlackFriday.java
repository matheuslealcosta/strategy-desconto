package padroescomportamentais.strategy;

public class DescontoBlackFriday implements Desconto {

    public float calcular(float valor) {
        return valor - (valor * 30 / 100);
    }
}
