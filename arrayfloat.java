
import java.util.concurrent.ThreadLocalRandom;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Niko
 */
public class arrayfloat {
    public static boolean find(float B[], float A) {

         for (int i = 0; i < B.length; i++) {
            if (B[i] == A) {
            return true;
            }
        }
            return false;
     }

    public static void main(String[] args) {
        System.out.println("Displaying numbers from 1 to 10:");
        System.out.println(" ");
        float B[] = new float[2000];
        float A = nextFloatBetween(1.0f, 10.0f);
        
        for (int k = 0; k < B.length; k++) {
            boolean res = find(B,A);
            while (res != false) {
                A = nextFloatBetween(1.0f, 10.0f);;
                res = find(B,A);
            }
            B[k] = A;
            System.out.println(B[k]);
        }
    }

    public static float nextFloatBetween(float min, float max) {
        return (ThreadLocalRandom.current().nextFloat() * (max - min)) + min;
    }
}
