/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Niko
 */
public class sorting2 {
    static boolean checkPair(int A[], int size, int x){
        
        for (int i = 0; i < (size - 1); i++) {
          for (int j = (i + 1); j < size; j++) {
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
