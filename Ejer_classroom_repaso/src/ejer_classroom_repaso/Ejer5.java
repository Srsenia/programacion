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
public class Ejer5 {

    static void introducir(){
        
    }
    
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int num;
        int cont=0;
        System.out.print("introduce n ");
        num=n.nextInt();
        
        int v[]=new int[num];
        for(int i=0;i<v.length;i++){
        System.out.print("introduce un numero");
        v[i]=n.nextInt();
        }
        
        for(int i=0;i<v.length;i++){
            if(v[i]%2!=0){ 
                
                cont++;
            }else{
                System.out.print("introduce un numero");
                v[i]=n.nextInt();
            }
        }
        
        System.out.println("cantidad de no pares "+cont);
        
       
        
        
        
        
    }
    
}
