/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Niko
 */
public class BNode {
    int A;
    BNode Left;
    BNode Right;
    
    public BNode(int A){
        this.A = A;
        Right = null;
        Left = null;
    }
}
