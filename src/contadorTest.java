import static org.junit.Assert.*;
import org.junit.Test;

public class contadorTest {
    @Test
    public void testContador() {
        contador calculo = new contador(3, 4, 1);

    }

    @Test
    public void testValorInicial(){
        contador c = new contador(1);
        assertEquals(0, c.getValorInicial());
    }

    @Test
    public void testIncremento(){
        contador c = new contador(1);
        assertTrue(c.incremento());
    }
    

    @Test
    public void testReset(){
        contador c = new contador(0,1,3);
        assertEquals(0, c.restart());
    }

    



}