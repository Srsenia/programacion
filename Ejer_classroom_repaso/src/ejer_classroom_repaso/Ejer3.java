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
public class Ejer3 {

    
    static float mitja(float num[],int x){
        float mitja1=0;
        for(int i=0;i<x;i++){
            
            mitja1+=num[i]/num.length;
        }
        return mitja1;
    }
    
    static float mitjanega(float num[],int x){
        float mitja2=0;
        float num2[]=new float[x];
        for(int i=0;i<x;i++){
            
            if(num[i]<0){
               num2[i]=num[i];
               mitja2+=num2[i]/num2.length;
            }
        }
        return mitja2;
    }
    
    static float mitjaposi(float num[],int x){
       float mitja3=0;
        float num3[]=new float[x];
        for(int i=0;i<x;i++){
            
            if(num[i]>0){
               num3[i]=num[i];
               mitja3+=num3[i]/num3.length;
            }
        }
        return mitja3;
    }
    
    static int contador(float num[],int x){
        int cont=0;
        
        for(int i=0;i<x;i++){
          
            if(num[i]==0){
                cont++;
            }
        }
        return cont;
    }
    
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        
        int x;
        
        System.out.print("introduce n");
        x=n.nextInt();
        
        float num[]=new float[x];
        
        for(int i=0;i<x;i++){
            System.out.print("introduce un numero decimal");
            num[i]=n.nextInt();
        }
        
        
        System.out.println("media "+mitja(num,x));
        System.out.println("media de los negativos "+mitjanega(num,x));
        System.out.println("media de los positivos "+mitjaposi(num,x));
        System.out.println("numero de ceros introducidos "+contador(num,x));
    }
    
}
