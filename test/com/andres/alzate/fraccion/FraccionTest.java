package com.andres.alzate.fraccion;

import com.andres.alzate.fraccion.Fraction;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by AfprogWin on 23/05/2016.
 */
public class FraccionTest {

    private final Integer NUMERADOR = 1;
    private final Integer DENOMINADOR = 2;

    @Test(expected = IllegalArgumentException.class)
    public void  creatinAFractionWithDenominatorZeroThrowsAnException(){
        Fraction fraccion = new Fraction(NUMERADOR,0);
    }

    @Test
    public void creatingAFractionSuccess(){
        Fraction fraccion = new Fraction(1,2);
        assertThat(fraccion.getNumerador(),equalTo(NUMERADOR));
        assertThat(fraccion.getDenominator(),equalTo(DENOMINADOR));
    }

    @Test
    public void creatingAFractionSuccessAndCheckReduction(){
        Fraction fraccionToReduce = new Fraction(6,4);
        Fraction fraccion = fraccionToReduce.reduce();
        assertThat(fraccion.getNumerador(),equalTo(3));
        assertThat(fraccion.getDenominator(),equalTo(2));
    }

}
