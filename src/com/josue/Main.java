package com.josue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        int userResponse = 0;

        do{
            try{
                System.out.println("====CALCULADORA====");
                System.out.println("Ingrese una opcion");
                System.out.println("    1. Suma");
                System.out.println("    2. Resta");
                System.out.println("    3. Multiplicacion");
                System.out.println("    4. Division");
                System.out.println("    5. Salir");
                System.out.println("\n");
                userResponse = Integer.parseInt(bf.readLine());

                switch (userResponse){
                    case 1:
                        doSum();
                        break;
                    case 2:
                        doSubtraction();
                        break;
                    case 3:
                        doMultiplication();
                        break;
                    case 4:
                        doDivision();
                        break;
                }
            }catch (IOException ioe){
                System.out.println("Error al tratar de leer respuesta del usuario");
            }catch (NumberFormatException nfe){
                System.out.println("El valor debe ser numerico");
            }
        }while(userResponse != 5);
    }

    private static void doSum() throws IOException{
        System.out.println("\n==SUMA");

        System.out.print(" Ingrese el primer numero>");
        float numero1 = Float.parseFloat(bf.readLine());

        System.out.print(" Ingrese el segundo numero>");
        float numero2 = Float.parseFloat(bf.readLine());

        float resultado = ArithmeticUtil.INSTANCE.sum(numero1,numero2);
        System.out.println("    El resultado es: " + resultado);
    }
    private static void doSubtraction() throws IOException{
        System.out.println("\n==RESTA");

        System.out.print(" Ingrese el primer numero>");
        float numero1 = Float.parseFloat(bf.readLine());

        System.out.print(" Ingrese el segundo numero>");
        float numero2 = Float.parseFloat(bf.readLine());

        float resultado = ArithmeticUtil.INSTANCE.substraction(numero1,numero2);
        System.out.println("    El resultado es: " + resultado);
    }
    private static void doMultiplication() throws IOException{
        System.out.println("\n==MULTIPLICACION");

        System.out.print(" Ingrese el primer numero>");
        float numero1 = Float.parseFloat(bf.readLine());

        System.out.print(" Ingrese el segundo numero>");
        float numero2 = Float.parseFloat(bf.readLine());

        float resultado = ArithmeticUtil.INSTANCE.multiplication(numero1,numero2);
        System.out.println("    El resultado es: " + resultado);
    }
    private static void doDivision() throws IOException{
        System.out.println("\n==MULTIPLICACION");

        System.out.print(" Ingrese el dividendo>");
        float numero1 = Float.parseFloat(bf.readLine());

        System.out.print(" Ingrese el divisor>");
        float numero2 = Float.parseFloat(bf.readLine());

        if(numero2 == 0){
            System.out.println("NO SE PUEDE DIVIDR UN NUMERO ENTRE 0");
            return;
        }

        float resultado = ArithmeticUtil.INSTANCE.division(numero1,numero2);
        System.out.println("    El resultado es: " + resultado);
    }
}
