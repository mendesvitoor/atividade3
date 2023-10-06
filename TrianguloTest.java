import static org.junit.jupiter.api.Assertions.;
import org.junit.jupiter.api.Test;

public class TrianguloTest {

    @Test
    public void testCalculaAreaTriangulo() {
        Triangulo triangulo = new Triangulo(4, 5);
        double resultado = triangulo.calculaArea();
        assertEquals(10.0, resultado);
    }
}
