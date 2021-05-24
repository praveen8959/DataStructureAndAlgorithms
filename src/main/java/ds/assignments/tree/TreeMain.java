package ds.assignments.tree;

public class TreeMain {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insertTree(25);
        tree.insertTree(20);
        tree.insertTree(15);
        tree.insertTree(27);
        tree.insertTree(30);
        tree.insertTree(29);
        tree.insertTree(26);
        tree.insertTree(22);
        tree.insertTree(32);

        tree.traverseInOrder();
        System.out.println();
        System.out.println(tree.get(15));
        System.out.println(tree.get(26));
        System.out.println(tree.get(99));
        System.out.println("------------------ MIN MAX ------------------");
        System.out.println(tree.min());
        System.out.println(tree.max());

        System.out.println("------------------ DELETE ------------------");
        tree.delete(27);
        tree.traverseInOrder();



    }
}
