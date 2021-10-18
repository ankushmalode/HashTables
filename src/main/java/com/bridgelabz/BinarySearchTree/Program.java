package com.bridgelabz.BinarySearchTree;

public class Program {
    public static void main(String[] args) {
        BST binaryTree=new BST();
        binaryTree.addNode(56);
        binaryTree.addNode(30);
        binaryTree.addNode(22);
        binaryTree.addNode(11);
        binaryTree.addNode(16);
        binaryTree.addNode(3);
        binaryTree.addNode(40);
        binaryTree.addNode(70);
        binaryTree.addNode(60);
        binaryTree.addNode(95);
        binaryTree.addNode(65);
        binaryTree.addNode(63);
        binaryTree.addNode(67);

        binaryTree.inOrder(binaryTree.root);
    }
}
