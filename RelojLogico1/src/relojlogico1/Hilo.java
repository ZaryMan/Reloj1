/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relojlogico1;

import java.util.*;

/**
 *
 * @author alxz_
 */
public class Hilo extends Thread { 
   int[] array = new int[3];
   public void init(){
       array[0] = 0;
       array[1] = 0;
       array[2] = 0;
   }  
   public void imprime(){
       System.out.println(Arrays.toString(array));
      
   }
   
   public void escribe(int a){
       Scanner s = new Scanner(System.in);
       System.out.println("Ingrese numero: ");
       array[a-1] = s.nextInt();
   }
   
   
       
 }
