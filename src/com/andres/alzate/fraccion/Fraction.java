package com.andres.alzate.fraccion;

/**
 * Created by AfprogWin on 23/05/2016.
 */
public class Fraction {
    private Integer numerador;
    private Integer denominator;

    public Fraction(Integer numerador, Integer denominador) {
        this.numerador = numerador;
        if( denominador > 0 ){
            this.denominator = denominador;
        } else {
            throw new IllegalArgumentException("Denominator can´t be zero");
        }
    }

    public Integer getNumerador() {
        return numerador;
    }

    public Integer getDenominator() {
        return denominator;
    }

    public Fraction reduce() {
        return null;
    }
}