package com.Graded_Assessment_GA2.Ques2;

public class PrintRightSkewedTree {
    // Function to traverse the right skewed tree using recursion
    public static void printRightSkewed(Node root) {
    	
        if(root == null) {
            return;
        }
        System.out.print(root.val + " ");
        printRightSkewed(root.right);       
    }

}
