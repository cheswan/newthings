/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Niko
 */
public class sorting {
     void ISort(int B[]){
      
        for (int i = 0; i < B.length; i++) {
            int key = B[i];
            int j = i - 1;
            while(j >= 0 && B[j] > key){
                B[j+1] = B[j];
                j = j -1;
            }
            B[j+1] = key;
        }
    }
    
    static boolean checkPair(int A[], int size, int x){
        sorting sort = new sorting();
        
        for (int i = 0; i < (size - 1); i++) {
            for (int j = (i + 1); j < size; j++) {
                sort.ISort(A);      
                if (A[i] + A[j] == x) {
                    System.out.println("Pair with a given sum " + x +" is (" + A[i] + ", " + A[j] + ")");
                    return true;
                }
            }
        }
    return false;
    }
    
    
    public static void main(String[] args){
        
      int Arr[] = {10, 6, 5, 4, 1};
      int x = 11;
      int size = Arr.length;
      
      if (checkPair(Arr, size, x)) {
        System.out.println("Valid pair exists");
      }
      else {
        System.out.println("No valid pair exists for " + x );
      }
    }
}
