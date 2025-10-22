package testes;

import org.example.Calculadora;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraTest {

    private Calculadora oCalculadora = new Calculadora();

    @BeforeEach
    public void setup() {
        System.out.println("^^^^^");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("vvvvv");
    }
    @Test
    public void testSomar() {
        Assertions.assertTrue(oCalculadora.soma(2, 3) == 5);
        Assertions.assertEquals(5, oCalculadora.soma(2, 3));
    }

    @Test
    public void assertivas() {
        Assertions.assertEquals("casa", "casa");
        Assertions.assertNotEquals("Casa", "casa");
        Assertions.assertTrue("casa".equalsIgnoreCase("Casa"));
        Assertions.assertTrue("casa".endsWith("sa"));
        Assertions.assertTrue("casa".startsWith("ca"));

        List<String> s1 = new ArrayList<>();
        List<String> s2 = new ArrayList<>();
        List<String> s3 = null;

        Assertions.assertEquals(s1, s2);
        Assertions.assertSame(s1, s1);
        Assertions.assertNotEquals(s1, s3);
        Assertions.assertNull(s3);
        Assertions.assertNotNull(s2);
    }

    @Test
    public void deveRetornarNumeroInteiroNaDivisao() {
        float resultado = oCalculadora.dividir(6, 2);
        Assertions.assertEquals(3, resultado);
    }

    @Test
    public void deveRetornarNumeroNegativoNaDivisao() {
        float resultado = oCalculadora.dividir(6, -2);
        Assertions.assertEquals(-3, resultado);
    }

    @Test
    public void deveRetornarNumeroDecimalNaDivisao() {
        float resultado = oCalculadora.dividir(10, 3);
        Assertions.assertEquals(3.0, resultado, 0.01);
    }

    @Test
    public void deveRetornarZeroComNumeradorNaDivisao() {
        float resultado = oCalculadora.dividir(0, 2);
        Assertions.assertEquals(0, resultado);

    }

    @Test
    public void deveLancarExcecaoDenominadorZeroNaDivisao() {
        Assertions.assertThrows(ArithmeticException.class, () -> oCalculadora.dividir(10, 0));
    }
}
