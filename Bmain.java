/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Niko
 */
public class Bmain {
    BNode link;
    BNode root;
   
        private BNode Insert(BNode link, int A){
            if (link == null){
                return new BNode(A);
            }else if (A > link.A){
                    link.Right = Insert(link.Right, A);
                    
            }else if (A < link.A){
                    link.Left = Insert(link.Left, A);
                    
            }else{
                  return link;  
            }
            return link;
        }
        
        public void add(int value) {
            root = Insert(root, value);
        }
        
        void displayPreorder(BNode link){
           
           if(link == null){
               return;
           }
               System.out.println(link.A + " ");
               displayPreorder(link.Left);
               displayPreorder(link.Right);
               
        }
        void printPreorder(){
            displayPreorder(root);
        }
        public BNode search(BNode root, int value){
            if (root==null || root.A==value){
                return root;
            }if (root.A < value){
                return search(root.Right, value);
            }
            return search(root.Left, value);
            }
        void Search(int A){
            BNode link = search(root, A);
            if(link != null){
                System.out.println("The Data Exist.");
            }else{
                System.out.println("The Data does not Exist.");
            }
        }
        BNode deleteRec(BNode root, int Value){
            if (root == null){
                return root;
            }if (Value < root.A){
                root.Left = deleteRec(root.Left, Value);
            }else if (Value > root.A){
                root.Right = deleteRec(root.Right, Value);
            }
            else {
            
                if (root.Left == null){
                    return root.Right;
                }
                else if (root.Right == null){
                    return root.Left;
                }
                root.A = minValue(root.Right);
                root.Right = deleteRec(root.Right, root.A);
            }
        return root;
        }
        int minValue(BNode root){
            int minv = root.A;
            while (root.Left != null){
                minv = root.Left.A;
                root = root.Left;
            }
        return minv;
        }
        void delete(int A){
            root = deleteRec(root, A); 
        }
}
