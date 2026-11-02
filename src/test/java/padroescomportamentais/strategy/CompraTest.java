package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompraTest {

    @Test
    void deveRetornarTotalSemDesconto() {
        Compra compra = new Compra(200.0f);
        assertEquals(200.0f, compra.getTotal());
    }

    @Test
    void deveAplicarDescontoCupom() {
        Compra compra = new Compra(200.0f);
        compra.aplicarDesconto(new DescontoCupom());
        assertEquals(180.0f, compra.getTotal());
    }

    @Test
    void deveAplicarDescontoBlackFriday() {
        Compra compra = new Compra(200.0f);
        compra.aplicarDesconto(new DescontoBlackFriday());
        assertEquals(140.0f, compra.getTotal());
    }

    @Test
    void deveAplicarDescontoClienteFiel() {
        Compra compra = new Compra(200.0f);
        compra.aplicarDesconto(new DescontoClienteFiel());
        assertEquals(185.0f, compra.getTotal());
    }

    @Test
    void deveTrocarDescontoDaCompra() {
        Compra compra = new Compra(200.0f);
        compra.aplicarDesconto(new DescontoCupom());
        compra.aplicarDesconto(new DescontoBlackFriday());
        assertEquals(140.0f, compra.getTotal());
    }

}
