import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person p1, Relationship re1, Person p2, Relationship re2) {
        tree.add(new Node(p1, re1, p2));
        tree.add(new Node(p2, re2, p1));
    }

}