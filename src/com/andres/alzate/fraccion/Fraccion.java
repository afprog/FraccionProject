package com.andres.alzate.fraccion;

import javaslang.control.Option;

/**
 * Created by AfprogWin on 23/05/2016.
 */
public class Fraccion {
    private Option<Integer> numerador;
    private Option<Integer> denominador;

    public Fraccion(Option<Integer> numerador, Option<Integer> denominador) {
        this.numerador = numerador;
        this.denominador = denominador.filter( n -> n > 0).map(n -> n).orElse( () -> {throw new IllegalArgumentException("El denominador no puede ser Cero");});
    }

    public Option<Integer> getNumerador() {
        return numerador;
    }

    public Option<Integer> getDenominador() {

        return denominador;
    }

    public Fraccion setNumerador(Option<Integer> numerador) {
        return new Fraccion(numerador,this.denominador);
    }

    public Fraccion setDenominador(Option<Integer> denominador) {
        return new Fraccion(this.numerador,denominador);
    }

    public Fraccion reduce() {
//        numerador.map(n -> IntegerCalcusUtils.mcd())
    }
}
