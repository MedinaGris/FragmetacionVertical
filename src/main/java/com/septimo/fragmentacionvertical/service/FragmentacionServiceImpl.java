/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.septimo.fragmentacionvertical.service;

/**
 *
 * @author Medina
 */
public class FragmentacionServiceImpl implements IFragmentacionService {

    public int[][] getGeneraAA(int[][] use, int[][] acc, int [][] ref, int n, int k, int l) {
        int contadorFila = 0;
        int contadorCol1 = 0;
        int contadorCol2 = 0;
        int[][] matrizAA = new int[n][n];

        int valorAA, valorRef;
        int multAARef = 0, mult, multiplicacionFinal = 0;
        int ban = 0, cont = 0;

        for (contadorCol1 = 0; contadorCol1 < n; contadorCol1++) {
            for (contadorFila = 0; contadorFila < k; contadorFila++) {
                multAARef = 0;
                for (contadorCol2 = 0; contadorCol2 < n; contadorCol2++) {
                    //System.out.println("fila1 " + contadorCol2 + " col1 " + contadorCol1 + " fila2 " + contadorCol2 + " col2 " + contadorFila);
                    if (use[contadorCol2][contadorCol1] == 1 && use[contadorCol2][contadorFila] == 1) {
                        for (int s = 0; s < l; s++) {
                            valorAA = acc[contadorCol2][s];
                            valorRef = ref[contadorCol2][s];
                            multAARef = multAARef + (valorAA * valorRef);
                            //  System.out.println("mult1"+mult1);
                            //System.out.println("multAARef1" + multAARef);
                        }
                        matrizAA[contadorCol1][contadorFila] = multAARef;
                       // System.out.println("cont" + cont);
                    } else {
                        if ((use[contadorCol2][contadorCol1] == 0 && use[contadorCol2][contadorFila] == 1)
                                || (use[contadorCol2][contadorCol1] == 1 && use[contadorCol2][contadorFila] == 0)
                                || (use[contadorCol2][contadorCol1] == 0 && use[contadorCol2][contadorFila] == 0)) {
                            cont++;
                            //System.out.println("cont" + cont);
                        }
                        //int numCol = matrizUso.getColumnCount();
                        int numCol = matrizAA.length;
                       // System.out.println("numCol" + numCol);
                        if (cont == numCol) {
                            matrizAA [contadorCol1][contadorFila] = 0;
                        }
                    }
                }
                cont = 0;
            }  
        }
        System.out.println("Contenido del array:");
            for (int i = 0; i < matrizAA.length; i++) {
                for (int j = 0; j < matrizAA[i].length; j++) {
                    System.out.print(matrizAA[i][j] + " ");
                }
                System.out.println();
            }
        return matrizAA;
    }
    

    public int[][] getGeneraCA(int[][] aa, int n, int k, int l) {
        int[][] response = null;
        return response;
    }

    public int getGeneraPuntoCorte(int[][] ca, int n, int k, int l) {
        int response = 0;
        return response;
    }

    public String getTablaFragmentada() {
        return "";
    }
    
    
    
    public static void main(String[] args) {
        int [][] use = {{1,0,1,0},{0,1,1,0}, {0,1,0,1}, {0,0,1,1}};
        int [][] acc = {{15,20,10},{5,0,0}, {25,25,25}, {3,0,0}};
        int [][] ref = {{1,1,1},{1,1,1},{1,1,1},{1,1,1}};
        
        
            
        FragmentacionServiceImpl a= new FragmentacionServiceImpl();
        a.getGeneraAA(use, acc, ref, 4, 4, 3);
        
    }

}
