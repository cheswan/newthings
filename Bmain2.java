/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Niko
 */
public class Bmain2 {
    public static void main(String[] args){
        
        Bmain A = new Bmain();
        
        A.add(13);
        A.add(16);
        A.add(9);
        A.add(10);
        A.add(7);
        A.add(8);
        A.printPreorder();
        A.Search(7);
        A.delete(10);
        A.delete(7);
        A.printPreorder();
        A.Search(7);
    }
}
