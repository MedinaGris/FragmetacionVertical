/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.septimo.fragmentacionvertical.service;

/**
 *
 * @author Medina
 */
public interface IFragmentacionService {

    public int[][] getGeneraAA(int[][] use, int[][] acc, int n, int k, int l);

    public int[][] getGeneraCA(int[][] aa, int n, int k, int l);

    public int getGeneraPuntoCorte(int[][] ca, int n, int k, int l);

    public String getTablaFragmentada();
}
