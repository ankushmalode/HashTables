package com.bridgelabz.BinarySearchTree;

class BST {
    Node root;

    public void addNode(int key) {
        Node newNode = new Node(key);

        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;

            while (true) {
                parent = focusNode;
                if (key < focusNode.key) {
                    focusNode = focusNode.leftChild;
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;
                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void inOrder(Node focusNode){
        if (focusNode!=null){
            inOrder(focusNode.leftChild);
            System.out.println(focusNode);
            inOrder(focusNode.rightChild);
        }
    }
}
