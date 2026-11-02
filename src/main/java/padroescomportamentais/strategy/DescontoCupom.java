package padroescomportamentais.strategy;

public class DescontoCupom implements Desconto {

    public float calcular(float valor) {
        return valor - (valor * 10 / 100);
    }
}
