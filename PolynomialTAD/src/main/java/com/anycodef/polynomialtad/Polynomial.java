/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anycodef.polynomialtad;

import java.util.ArrayList;
/**
 *
 * @author anycodef
 */
public class Polynomial implements iPolynomial{
    private final ArrayList<Integer> coeficient;
    
    public Polynomial(ArrayList<Integer> coeficient) {
        this.coeficient = coeficient;
    }

    @Override
    public int getDegree() {
        return coeficient.size() - 1;
    }

    @Override
    public int getCoeficient(int n) {
        if ( 0 <= n && n < coeficient.size() ) {
            return coeficient.get(n);
        } else {
            return 0;
        }
    }

    @Override
    public void setCoeficient(int n, int newValue) {
        if ( 0 <= n && n < coeficient.size() ) {
            coeficient.set(n, newValue);
        }
    }

    @Override
    public int getValue(int x) {
        int polynomial = 0;
        
        for (int e = 0; e < coeficient.size(); e++) {
            polynomial += coeficient.get(e) * Math.pow(x, e);
        }
        
        return polynomial;
    }

    @Override
    public iPolynomial suma(iPolynomial p) {
        int mayorDegree = p.getDegree();
        ArrayList<Integer> newCoeficient;
        newCoeficient = new ArrayList();
        
        if (mayorDegree < getDegree()) {
            mayorDegree = getDegree();
        }
        
        for (int e = 0; e < mayorDegree; e++) {
            newCoeficient.add(p.getCoeficient(e) + getCoeficient(e));
        }
        
        return new Polynomial(newCoeficient);
    }
}
