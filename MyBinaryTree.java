package com.bridgelabz.binarysearchtree;

public class MyBinaryTree<T extends Comparable<T>> {
    private MyBinaryNode<T> root;

    public void add(T data){
        this.root = this.addRecursively(root,data);
    }

    private MyBinaryNode<T> addRecursively(MyBinaryNode<T> current, T data) {
        if(current == null)
            return new MyBinaryNode<>(data);
        int compareResult = data.compareTo(current.data);
        if(compareResult == 0) return current;
        if(compareResult < 0){
            current.left = addRecursively(current.left, data);
        }
        else{
            current.right = addRecursively(current.right, data);
        }
        return current;
    }

    public int getSize(){
        return this.getSizeRecursive(root);
    }

    private int getSizeRecursive(MyBinaryNode<T> current){
        return current == null ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
    }


    public void display() {
        displayTree(root);
    }
    public void displayTree(MyBinaryNode root){
        if (root == null) {
            return;
        }
        String strRoot = " <- " + root.data + " -> ";

        String strLeft = (root.left == null) ? "null" :  "" + root.left.data;
        String strRight = (root.right == null) ? "null" : "" + root.right.data;

        System.out.println("ROOT="+strRoot);
        System.out.println("left="+strLeft);
        System.out.println("right="+strRight);

        displayTree(root.left);
        displayTree(root.right);
    }


    public void search(T searchData) {
        System.out.println();
        if(searchData(root,searchData)){
            System.out.println(searchData + " FOUND IN BINARY TREE");
        }else{
            System.out.println(searchData + " NOT FOUND IN BINARY TREE");
        }
        System.out.println();
    }
    private boolean searchData(MyBinaryNode root, T searchData) {
            if (root == null)
                return false;

            if (root.data == searchData)
                return true;

            // then recur on left subtree /
            boolean res1 = searchData(root.left, searchData);

            // node found, no need to look further
            if(res1) return true;

            // node is not found in left,
            // so recur on right subtree /
            boolean res2 = searchData(root.right, searchData);

            return res2;
    }
}
