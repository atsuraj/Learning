package com.grocery.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SameBinaryTree {

    static class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        boolean flag = true;
        if(p==null && q== null) return  true;

        if(p==null || q==null)
            return false;

        if(p.val!=q.val)
            flag = isSameTree(p.left,q.left);
        if(flag)
             flag= isSameTree(p.right,q.right);

        return flag ;
    }

    public static int minDiffInBST(TreeNode root) {

        if (root==null) return 0;

        List<Integer> list = new ArrayList<>();
          inOrder(root,list);
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < list.size()-1; i++) {
            int temp = list.get(i+1)-list.get(i);
            if(temp<diff)
                diff=temp;
        }
        System.out.println(diff);
        return diff;
    }

    public static  void inOrder(TreeNode root,List<Integer> list){
        if(root==null) return ;
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }

    public static  void inOrder(TreeNode root,List<String> list,String str){
        if(root.left == null && root.right == null) list.add(str = str + root.val);
        if(root.left!=null){inOrder(root.left,list,str+root.val+"->"); }
        if(root.right!=null){inOrder(root.right,list,str+root.val+"->");}

            System.out.println(list);
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        inOrder(root,list,"");
        return list;
    }

    public static void main(String[] args) {
        TreeNode t = new TreeNode(1);
        TreeNode t3 = new TreeNode(3);
        TreeNode t2 = new TreeNode(2,t,null);
        TreeNode t1 = new TreeNode(1);
        TreeNode t12 = new TreeNode(2,t3,t1);

       // System.out.println(SameBinaryTree.isSameTree(t2,t12));
        //System.out.println(SameBinaryTree.minDiffInBST(t12));
        System.out.println(SameBinaryTree.binaryTreePaths(t12));
    }



}
