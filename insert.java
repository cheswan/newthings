/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Niko
 */
public class insert {
    void ISort1(int B[]){
      
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
    public static int find(int B[], int A){
         
        for (int i = 0; i < B.length;i++) {
             if (B[i] == A){
                return i;
             }
         }
            return -1;
     }
    void Proc(int B[], int A){
        insert Sort = new insert();
        
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
        Sort.ISort1(B);
    }
    void Print(int B[]){
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }
    }
    public static void main(String[] args){
        insert Sort = new insert();
        
        int C[] = new int [2000];
        int A = (int) (Math.random() * 2000);
        
          Sort.Proc(C,A);
          Sort.Print(C);
         
    }
}
