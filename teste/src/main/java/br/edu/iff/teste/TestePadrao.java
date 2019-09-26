/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.iff.teste;

/**
 *
 * @author samsung
 */
public class TestePadrao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TemPadrao tp = new TemPadrao();
        System.out.println("int:" + tp.codigo);
        System.out.println("boolean:" + tp.teste);
        System.out.println("char:"+tp.a+".");
        System.out.println("char:"+tp.ha);
        
        int x = 12;
        tp.ha = String.valueOf(x);
        tp.ha = ""+12;
        tp.ha = ""+x;
    }
    
}
