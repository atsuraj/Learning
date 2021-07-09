package com.grocery.controller;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){this.val=val;}
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}
public class StringFromBinaryTree {



    public String tree2str(TreeNode root) {
        StringBuilder s = new StringBuilder();
        return readLeft(root,s);
    }

    public String readLeft(TreeNode root,StringBuilder s){
            s.append(root.val);
            if(root.left==null && root.right==null) s.append("()");
            if(root.left!=null) {
                s.append("(");
                readLeft(root.left,s);
                s.append(")");
            }
            if(root.right!=null) {
                s.append("(");
                readLeft(root.right,s);
                s.append(")");
            }
        return s.toString();
    }

    public static void main(String[] args) {
        TreeNode t = new TreeNode(5);
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(10,t1,t);
        TreeNode t3 = new TreeNode(9,t2,t);

        /*
                9
             10     5
           3    5
        */
        StringFromBinaryTree s = new StringFromBinaryTree();
        StringBuilder s1 = new StringBuilder();
        s.readLeft(t3,s1);

    }

}
