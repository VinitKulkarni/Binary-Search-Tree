package com.bridgelabz.binarysearchtree;

public class BinaryTreeMainMethod<T> {
    public static void main(String args[]){
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        //START:Adding elements into binary tree----------
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(88);
        myBinaryTree.add(1);
        //----------END:Adding elements into binary tree

        //START:size of binary tree----------
        int size = myBinaryTree.getSize();
        System.out.println("size of binary search tree: "+size);
        //----------END:size of binary tree

        //START:display binary tree----------
        myBinaryTree.display();
        //----------END:display binary tree

        //START:search element in binary tree----------
        myBinaryTree.search(1);
        myBinaryTree.search(99);
        //----------END:search element in binary tree
    }
}
