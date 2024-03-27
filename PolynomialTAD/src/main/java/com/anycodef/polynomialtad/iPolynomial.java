/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anycodef.polynomialtad;

/**
 *
 * @author anycodef
 */
public interface iPolynomial {
    public int getDegree();
    public int getCoeficient(int n);
    public void setCoeficient(int n, int newValue);
    public int getValue(int x);
    public iPolynomial suma(iPolynomial p);
}
