/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package main;

/**
 *
 * @author AULAFISI
 */
public interface matrizInterface {
    
     public void startMatrix();
    
     public void show();
     
     public void traspuesta();
      
     public Matrix plus(Matrix sumando);
      
     public Matrix minus(Matrix sustraendo);
      
     public boolean equal(Matrix otherMatrix);
     
     public int getFilas();
     
     public int traza();

     public void setFilas(int filas);

     public int getColumnas();

     public void setColumnas(int columnas);

     public int[][] getMatriz();

     public void setMatriz(int[][] matriz);
      
}