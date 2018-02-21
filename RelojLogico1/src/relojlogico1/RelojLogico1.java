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
public class RelojLogico1 {

    public void h(){
          
      }
    public static void main(String[] args) {
      Hilo h1 = new Hilo();
      Hilo h2 = new Hilo();
      Hilo h3 = new Hilo();
      h1.init();
      h2.init();
      h3.init();
      
    
      
      Scanner s = new Scanner(System.in);
      int referencia;
      do{  
        
        System.out.println("1.- Escribir en hilo");
        System.out.println("2.- Enviar hilo");
        System.out.println("3.- Imprimir hilos");
        System.out.println("4.- Salir");
        System.out.println("Elija la opcion deseada: ");
        referencia = s.nextInt();
        switch(referencia){
            case 1:
                System.out.println("Ingrese numero de hilo: ");
                int a = s.nextInt();
                switch(a){
                    case 1:
                        h1.escribe(a);
                        break;
                    case 2:
                        h2.escribe(a);
                        break;
                    case 3:
                        h3.escribe(a);
                        break;
                       
                }
                break;
            case 2:
                System.out.println("Numero de hilo a enviar: ");
                int b = s.nextInt();
                switch(b){
                    case 1:
                        for (int i = 0; i < 3; i++) {
                            h2.array[i] = h1.array[i];
                            h3.array[i] = h1.array[i];
            
                        }
                        break;
                    case 2:
                        for (int i = 0; i < 3; i++) {
                            h1.array[i] = h2.array[i];
                            h3.array[i] = h2.array[i];
            
                        }
                        break;
                    case 3:
                        for (int i = 0; i < 3; i++) {
                            h1.array[i] = h2.array[i];
                            h3.array[i] = h2.array[i];
            
                        }
                        break;                  
                }
                
            case 3:
                   System.out.println("Hilo 1: "+Arrays.toString(h1.array));
                   System.out.println("Hilo 2: "+Arrays.toString(h2.array));
                   System.out.println("Hilo 3: "+Arrays.toString(h3.array));
                   break;
                
            default:
                System.out.println("Opcion no valida");
        }
      }while(referencia != 4);
     
      

        
        System.out.println(Arrays.toString(h2.array));
    }
    
}
