package com.andres.alzate.fraccion;

/**
 * Created by AfprogWin on 23/05/2016.
 */
public class IntegerCalcusUtils {
    public static int mcd(int a, int b){
        return b == 0 ? a : mcd(b, a % b);
    }

    public static int mcm(int a, int b) {
        return a * b / mcd(a, b);
    }
}
