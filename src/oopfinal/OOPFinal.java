package oopfinal;

import java.util.Random;
import java.util.Scanner;


public class OOPFinal {

     public static int array[]=new int[100];
     
    public static void main(String[] args) {
        
        
        Random random=new Random();

        
        String degisken = null;
        int arrayLengt= array.length;
        boolean kontrol=true;
        SortFactory sortFactory=new SortFactory();
         Scanner input=new Scanner(System.in);
        
     
        
      
            
            
        
        
        System.out.println("Sırası ile Sıralam algoritmaları çalışıyor ..");
        System.out.println("1: Buble Sort");
        
               long basla=System.nanoTime();
                     degisken="Buble Sort";
                 Sorting sort1=  SortFactory.getSorting(degisken);
                sort1.sort(array, 0, 0);
                 long finish1=System.nanoTime();
                     long sonuc1=finish1- basla;
           System.out.println("Geçen Zaman Buble Sort için: "+  sonuc1);
           basla=0;
           
           
        
        System.out.println("2: Quick Sort");
            for (int i=0;i<array.length;i++){
            array[i]=random.nextInt(50);
        }
        
         long basla2=System.nanoTime();
            degisken="Quick Sort";
              Sorting sort2=  SortFactory.getSorting(degisken);
                
                sort2.sort(array, 0, arrayLengt-1);
              long finish2=System.nanoTime();
 
        long sonuc2=finish2- basla2;
           System.out.println("Geçen Zaman Quick Sort için : "+  sonuc2);
           basla2=0;
           
           
           
           
           
        System.out.println("3: Insertion Sort");
        
         for (int i=0;i<array.length;i++){
            array[i]=random.nextInt(50);
        }
        
            long basla3=System.nanoTime();
                 degisken="Insertion Sort";
                 Sorting sort3=  SortFactory.getSorting(degisken);
                 sort3.sort(array, 0, 0);
               long finish3=System.nanoTime();
 
        long sonuc=finish3- basla3;
           System.out.println("Geçen Zaman Insertion Sort için : "+  sonuc);
              basla3=0;
             
             

       
        
               
            
            
                 
          


        
      
          
       
        } //end of while
        


     
    
    }
    

