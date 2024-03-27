/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anycodef.polynomialtad;

import java.util.ArrayList; 
import java.util.Scanner;


/**
 *
 * @author anycodef
 */
public class Main {
      
    public static void main(String[] args) {
        ArrayList<Integer> coeficientP1 = new ArrayList<>();
        ArrayList<Integer> coeficientP2 = new ArrayList<>();
        
        int coeficient;
        String entrada;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Usa un valor no numerico para terminar de ingresar.");
        
        System.out.println("\n\nIngrese los coeficientes del polinomio 1: ");

        // ingresar coeficientes primer polinomio
        do {
            System.out.print("c: ");
            entrada = scanner.next();
            
            try {
                coeficient = Integer.parseInt(entrada);
                coeficientP1.add(coeficient);
                
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número entero válido o 's' para terminar.");
            }
            
        } while (!"s".equals(entrada));
        
        System.out.println("\n\nIngrese los coeficientes del polinomio 2: ");

        // ingresar coeficientes segundo polinomio
        do {
            System.out.print("c: ");
            entrada = scanner.next();
            
            try {
                coeficient = Integer.parseInt(entrada);
                coeficientP2.add(coeficient);
                
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número entero válido o 's' para terminar.");
            }
            
        } while (!"s".equals(entrada));
        
        // instanciar polinomios
        Polynomial polinomio1 = new Polynomial(coeficientP1);
        Polynomial polinomio2 = new Polynomial(coeficientP2);
        Polynomial polinomioSuma;
        
        // operaciones
        
        System.out.println("\n\n OPERACIONES CON POLINOMIOS\n");
        System.out.println("\n\n POLINOMIOS 1\n");
        System.out.print("\nGrado: ");
        System.out.println(polinomio1.getDegree());
        System.out.println("\nObtener coeficiente");
        System.out.println(polinomio1.getCoeficient(0));
        System.out.println("\nObtener valor p(10)");
        System.out.println(polinomio1.getValue(10));
        
        System.out.println("\n\t\tSuma de polinomios:");
        polinomioSuma = (Polynomial)polinomio1.suma(polinomio2);
        
        System.out.println("\ncoeficientes polinomio suma:");
        for (int i = 0; i <= polinomioSuma.getDegree(); i++) {
            System.out.println(polinomioSuma.getCoeficient(i));
        }
    }
}
