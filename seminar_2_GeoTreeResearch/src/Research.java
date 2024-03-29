import java.util.ArrayList;

public class Research implements Printable{
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.getName() == p.getName() && t.re == re) {
                result.add(t.p2.getName());
            }
        }
        print(result);
        return result;
    }

    @Override
    public void print(Object o) {
        System.out.println(o);
    }
}