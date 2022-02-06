package oopfinal;
import static oopfinal.OOPFinal.array;

public class InsertionSort implements Sorting {
    
    
     @Override
    public void sort(int arr[],int a,int b){
        
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            }
         //   System.out.println("Güncel Dizi Insertion Sort ");
         //   printArray(arr);
            arr[j + 1] = key; 
        } 
        
    }
     static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
}
