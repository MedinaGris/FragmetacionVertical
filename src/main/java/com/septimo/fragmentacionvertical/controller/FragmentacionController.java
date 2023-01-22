/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.septimo.fragmentacionvertical.controller;

import com.septimo.fragmentacionvertical.service.FragmentacionServiceImpl;
import com.septimo.fragmentacionvertical.service.IFragmentacionService;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Medina
 */

@RequestScoped
@ManagedBean(name = "General")
public class FragmentacionController {
        private IFragmentacionService service;

    
      @PostConstruct
    public void init() {
        service = new FragmentacionServiceImpl();
    
    }
    
    
    
    public int[][] getGeneraAA(int [][] use, int [][] acc,int n,int k,int l){
    return service.getGeneraAA(use, acc, n, k, l);
    }
    
    public int[][] getGeneraCA(int [][] aa, int n,int k,int l){
    return service.getGeneraCA(aa, n, k, l);
    }
    
    public int getGeneraPuntoCorte(int [][] ca,int n,int k,int l){
        
    return service.getGeneraPuntoCorte(ca, n, k, l);
    }
  
    public String getTablaFragmentada(){
    return service.getTablaFragmentada();
    }
}
