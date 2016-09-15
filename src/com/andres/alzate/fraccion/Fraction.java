package com.andres.alzate.fraccion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
        this.reduce();
    }

    public Integer getNumerador() {
        return numerador;
    }

    public Integer getDenominator() {
        return denominator;
    }

    public void reduce() {
        int mcd = IntegerCalculations.mcd(numerador, denominator);
        denominator /= mcd;
        numerador /= mcd;
    }

    public Fraction sum(Fraction x){
        Integer denominatorMcm = IntegerCalculations.mcm(this.denominator,x.getDenominator());
        Integer numeratorResult = sumDenominatorsCalculation(this, denominatorMcm) + sumDenominatorsCalculation(x, denominatorMcm);
        return new Fraction(numeratorResult,denominatorMcm);
    }

    public Fraction sub(Fraction x){
        Integer denominatorMcm = IntegerCalculations.mcm(this.denominator,x.getDenominator());
        Integer numeratorResult = sumDenominatorsCalculation(this, denominatorMcm) - sumDenominatorsCalculation(x, denominatorMcm);
        return new Fraction(numeratorResult,denominatorMcm);
    }

    private Integer sumDenominatorsCalculation(Fraction x, Integer mcm){
        return mcm / x.getDenominator() * x.getNumerador();
    }

}
