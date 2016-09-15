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
        assertThat(fraccionToReduce.getNumerador(),equalTo(3));
        assertThat(fraccionToReduce.getDenominator(),equalTo(2));
    }

    @Test
    public void sumFractionSuccess(){
        Fraction fraccionOne = new Fraction(5,4);
        Fraction fractionTwo = new Fraction(3,6);
        Fraction result = fraccionOne.sum(fractionTwo);
        assertThat(result.getNumerador(),equalTo(7));
        assertThat(result.getDenominator(),equalTo(4));
    }
    @Test
    public void sumFractionSuccessComplex(){
        Fraction fraccionOne = new Fraction(25,24);
        Fraction fractionTwo = new Fraction(13,16);
        Fraction result = fraccionOne.sum(fractionTwo);
        assertThat(result.getNumerador(),equalTo(89));
        assertThat(result.getDenominator(),equalTo(48));
    }
    @Test
    public void subFractionSuccess(){
        Fraction fraccionOne = new Fraction(5,4);
        Fraction fractionTwo = new Fraction(3,6);
        Fraction result = fraccionOne.sub(fractionTwo);
        assertThat(result.getNumerador(),equalTo(3));
        assertThat(result.getDenominator(),equalTo(4));
    }
    @Test
    public void subFractionSuccessComplex(){
        Fraction fraccionOne = new Fraction(25,24);
        Fraction fractionTwo = new Fraction(13,16);
        Fraction result = fraccionOne.sub(fractionTwo);
        assertThat(result.getNumerador(),equalTo(11));
        assertThat(result.getDenominator(),equalTo(48));
    }

}
