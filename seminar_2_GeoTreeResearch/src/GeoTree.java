import java.util.ArrayList;

public abstract class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person p1, Relationship re, Person p2) {
        tree.add(new Node(p1, re, p2));
    }

}