package 基础知识.数据结构.Java版数据结构与算法.二叉树.DinBinaryTree;

import sun.reflect.generics.tree.Tree;

/**
 * @author GaoHangHang
 * @date 2018/07/21 17:08
 **/
public class SearchBinaryTree {

    public static void main(String[] args) {
        SearchBinaryTree binaryTree = new SearchBinaryTree();
        int[] intArray = new int[]{50, 30, 20, 44, 88, 33, 16, 7, 77};
        for (int i : intArray) {
            binaryTree.put(i);
        }
        binaryTree.midOrder(binaryTree.root);
    }

    private TreeNode root;

    public SearchBinaryTree() {

    }

    //中序遍历
    public void midOrder(TreeNode node) {
        if (node == null) {
            return;
        } else {
            midOrder(node.leftChild);
            System.out.println(node.data);
            midOrder(node.rightChild);
        }
    }

    /**
     * 创建查找二叉树，添加结点
     */
    public TreeNode put(int data) {
        TreeNode node = null;
        TreeNode parent = null;
        if (root == null) {
            node = new TreeNode(0, data);
            root = node;
        }
        node = root;
        while (node != null) {
            parent = node;
            if (data > node.data) {
                node = node.rightChild;
            } else if (data < node.data) {
                node = node.leftChild;
            } else {
                return node;
            }
        }
        //表示将此结点添加到相应位置
        node = new TreeNode(0, data);
        if (data < parent.data) {
            parent.leftChild = node;
        } else {
            parent.rightChild = node;
        }
        node.parent = parent;
        return node;
    }

    class TreeNode {
        private int key;
        private TreeNode leftChild;
        private TreeNode rightChild;
        private TreeNode parent;
        private int data;

        public TreeNode(int key, int data) {
            this.key = key;
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
            this.parent = null;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public TreeNode getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(TreeNode leftChild) {
            this.leftChild = leftChild;
        }

        public TreeNode getRightChild() {
            return rightChild;
        }

        public void setRightChild(TreeNode rightChild) {
            this.rightChild = rightChild;
        }

        public TreeNode getParent() {
            return parent;
        }

        public void setParent(TreeNode parent) {
            this.parent = parent;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }
}
