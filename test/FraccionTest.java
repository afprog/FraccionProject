import com.andres.alzate.fraccion.Fraccion;
import javaslang.control.Option;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by AfprogWin on 23/05/2016.
 */
public class FraccionTest {

    private final Option<Integer> NUMERADOR = Option.of(1);
    private final Option<Integer> DENOMINADOR = Option.of(2);

    @Test(expected = IllegalArgumentException.class)
    public void craateFraccionWithDenominatorZeroTest(){
        Fraccion fraccion = new Fraccion(Option.of(1),Option.of(0));
    }

    @Test
    public void craateFraccionTest(){
        Fraccion fraccion = new Fraccion(Option.of(1),Option.of(2));
        assertThat(fraccion.getNumerador(),equalTo(NUMERADOR));
        assertThat(fraccion.getDenominador(),equalTo(DENOMINADOR));
    }

    @Test
    public void craateFraccionAndReduceTest(){
        Fraccion fraccionToReduce = new Fraccion(Option.of(6),Option.of(4));
        Fraccion fraccion = fraccionToReduce.reduce();
        assertThat(fraccion.getNumerador(),equalTo(Option.of(3)));
        assertThat(fraccion.getDenominador(),equalTo(Option.of(2)));
    }

}
