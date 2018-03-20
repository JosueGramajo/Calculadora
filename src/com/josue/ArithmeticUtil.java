package com.josue;

/**
 * Created by josue on 19/03/2018.
 */
public class ArithmeticUtil {
    public static ArithmeticUtil INSTANCE = new ArithmeticUtil();

    public float sum(float x, float y){
        return x + y;
    }
    public float substraction(float x, float y){
        return x - y;
    }
    public float multiplication(float x, float y){
        return x * y;
    }
    public float division(float x, float y){
        return x / y;
    }
}
