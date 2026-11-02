package padroescomportamentais.strategy;

public class DescontoClienteFiel implements Desconto {

    public float calcular(float valor) {
        return valor - 15.0f;
    }
}
