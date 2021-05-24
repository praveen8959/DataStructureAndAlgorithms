package ds.assignments.tree;

public class TreeNode {

    private int      data;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public void insertTreeNode(int value) {
        if (data == value) {
            return;
        }
        if (value < data) {
            if (leftNode != null) {
                leftNode.insertTreeNode(value);
            } else {
                leftNode = new TreeNode(value);
            }
        } else {
            if (rightNode != null) {
                rightNode.insertTreeNode(value);
            } else {
                rightNode = new TreeNode(value);
            }
        }
    }

    public TreeNode get(int value) {
        if (value == data) {
            return this;
        }
        if (value < data) {
            if (leftNode != null) {
                return leftNode.get(value);
            }
        } else {
            if (rightNode != null) {
                return rightNode.get(value);
            }
        }
        return null;
    }

    public int min() {
        if (leftNode == null) {
            return data;
        } else {
            return leftNode.min();
        }
    }

    public int max() {
        if (rightNode == null) {
            return data;
        } else {
            return rightNode.max();
        }
    }

    public void traverseInOrder() {
        if (leftNode != null) {
            leftNode.traverseInOrder();
        }
        System.out.print(data + ", ");
        if (rightNode != null) {
            rightNode.traverseInOrder();
        }
    }

    public TreeNode(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Data = " + data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
