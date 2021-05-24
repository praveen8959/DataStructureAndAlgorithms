package ds.assignments.tree;

public class Tree {

    private TreeNode root;

    public void insertTree(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insertTreeNode(value);
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subTreeRoot, int value) {
        if (subTreeRoot == null) {
            return null;
        }
        if (value < subTreeRoot.getData()) {
            subTreeRoot.setLeftNode(delete(subTreeRoot.getLeftNode(), value));
        } else if (value > subTreeRoot.getData()) {
            subTreeRoot.setRightNode(delete(subTreeRoot.getRightNode(), value));
        } else {
            if (subTreeRoot.getLeftNode() == null) {
                return subTreeRoot.getRightNode();
            } else if (subTreeRoot.getRightNode() == null) {
                return subTreeRoot.getLeftNode();
            } else {
                subTreeRoot.setData(subTreeRoot.getRightNode().min());
                subTreeRoot.setRightNode(delete(subTreeRoot.getRightNode(), subTreeRoot.getData()));
            }
        }
        return subTreeRoot;
    }

    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }

    public int min() {
        if (root != null) {
            return root.min();
        }
        return Integer.MIN_VALUE;
    }

    public int max() {
        if (root != null) {
            return root.max();
        }
        return Integer.MAX_VALUE;
    }

}
