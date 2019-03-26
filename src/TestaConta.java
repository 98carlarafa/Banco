/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class TestaConta {
    
    public static void main(String[] args) {
        
        Conta c1 = new Conta ();
        c1.saldo = 9999;
        c1.titular = "Lara Caroline";
        c1.agencia = "1264";
        c1.numero = "5432";
        
        System.out.println ("Salso do c1: " + c1.saldo);
        
        Conta c2 = new Conta ();
        c2.saldo = 500;
        c2.titular = "Luciano Souza";
        c2.agencia = "007";
        c2.numero = "999";  
        
        System.out.println ("Salso do c2: " + c2.saldo);
        
    }
}
