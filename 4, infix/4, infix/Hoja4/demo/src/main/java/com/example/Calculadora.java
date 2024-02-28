package com.example;

/** 
 * @return Calculadora
 */

 import java.util.ArrayList;
 
 public class Calculadora implements CalculadoraPOSFIX {
 
     public Stack<Integer> stack;
     public ArrayList<Character> operators;
 
     public int posfix(){
         
         int result = 0;
         for (int i = 0; i < operators.size(); i++) {//recorrido de cada operacion
             if (stack.size() < 2) {
                 throw new IllegalStateException("No hay suficientes operandos en la pila.");
             }
             int x = stack.pop(); // sacar entero 1
             int y = stack.pop(); // sacar entero 2
             result =  calcular(operators.get(i),x,y);
             stack.push(result);
         }
         return result;
     }
 
     public int calcular(char operator, int a, int b){ //calculadora aritmetica
         switch (operator) { 
             case '+':
                 return add(a, b);
             case '-':
                 return dif(a, b);
             case '*':
                 return mult(a, b);
             case '/':
                 if (b == 0) {
                 throw new ArithmeticException("División por cero.");
                 }
                 return div(a, b);
             default:
                 throw new IllegalArgumentException();
         }
     }
 
     public int add(int a, int b){ //suma
         return a + b;
     }
 
     public int dif(int a, int b){ //resta
         return a - b;
     }
 
     public int mult(int a, int b){ //multiplicacion
         return a * b;
     }
 
     public int div(int a, int b){ //division
         return a / b;
     }
 
 }
 
