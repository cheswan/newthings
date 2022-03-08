/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Niko
 */
public class select {
    void SSort1(int B[]){
      
        for (int i = 0; i < B.length-1; i++) {
            int min = i;
            for (int j = i+1; j < B.length; j++) {
                if (B[j] < B[min]){
                    min = j;
                }
            }
                int C = B[min];
                B[min] = B[i];
                B[i] = C;
            
        }
    }
    public static int find(int B[], int A){
         
        for (int i = 0; i < B.length;i++) {
             if (B[i] == A){
                return i;
             }
         }
            return -1;
     }
    void Proc(int B[], int A){
        select Sort = new select();
        
        for (int k = 0; k < B.length;k++) {
         int result = find(B,A);
         while (result != -1){
               A = (int) (Math.random() * 2000);
               result = find(B,A);
               if (result == 0){
                   break;
                }
            }
         B[k] = A;
         }
        Sort.SSort1(B);
    }
    void Print(int B[]){
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }
    }
    public static void main(String[] args){
        select Sort = new select();
        
        int C[] = new int [2000];
        int A = (int) (Math.random() * 2000);
        
          Sort.Proc(C,A);
          Sort.Print(C);
         
    }
}
