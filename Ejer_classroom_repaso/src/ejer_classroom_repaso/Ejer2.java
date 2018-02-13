/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_classroom_repaso;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejer2 {

     static void llegir(int num[],int x){
        Scanner n=new Scanner(System.in);
        for(int i=0;i<x;i++){
            System.out.print("introduzca un numero decimal");
            num[i]=n.nextInt();
        }
        
    }
    
    static float imprimir(int num[],int x){
        
        for(int i=x-1;i>0;i++){
            System.out.print(num[i]);
        }
        return num[x];
    }
   
    public static void main(String[] args) {
        
        Scanner n=new Scanner(System.in);
        
        int x;
        
        System.out.print("escribe n");
        x=n.nextInt();
        
        int num[]=new int[x];
        
        llegir(num,x);
        imprimir(num,x);
    }
    
}
