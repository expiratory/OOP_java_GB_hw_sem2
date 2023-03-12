import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Person ivanovaIrina = new Person("Иванова Ирина", Gender.female, 80);
        Person ivanovVasya = new Person("Иванов Вася", Gender.male, 83);
        Person ivanovaMasha = new Person("Иванова Маша", Gender.female, 79);
        Person ivanovaZhenya = new Person("Иванова Женя", Gender.female,45);
        Person ivanovVanya = new Person("Иванов Ваня", Gender.male, 81);
        Person ivanovPetya = new Person("Иванов Петя", Gender.male, 50);
        Person ivanovaSveta = new Person("Иванова Света", Gender.female, 25);
        Person ivanovDima = new Person("Иванов Дима", Gender.male, 20);

        GeoTree gt = new GeoTree();

        gt.append(ivanovaIrina, Relationship.mother, ivanovPetya, Relationship.son);
        gt.append(ivanovVasya, Relationship.father, ivanovPetya, Relationship.son);

        gt.append(ivanovaMasha, Relationship.mother, ivanovaZhenya, Relationship.daughter);
        gt.append(ivanovVanya, Relationship.father, ivanovaZhenya, Relationship.daughter);

        gt.append(ivanovaZhenya, Relationship.mother, ivanovaSveta, Relationship.daughter);
        gt.append(ivanovPetya, Relationship.father, ivanovaSveta, Relationship.daughter);

        gt.append(ivanovaZhenya, Relationship.mother, ivanovDima, Relationship.son);
        gt.append(ivanovPetya, Relationship.father, ivanovDima, Relationship.son);

        gt.append(ivanovaIrina, Relationship.grandmother, ivanovaSveta, Relationship.granddaughter);
        gt.append(ivanovaMasha, Relationship.grandmother, ivanovaSveta, Relationship.granddaughter);
        gt.append(ivanovaIrina, Relationship.grandmother, ivanovDima, Relationship.grandson);
        gt.append(ivanovaMasha, Relationship.grandmother, ivanovDima, Relationship.grandson);

        gt.append(ivanovVasya, Relationship.grandfather, ivanovaSveta, Relationship.granddaughter);
        gt.append(ivanovVanya, Relationship.grandfather, ivanovaSveta, Relationship.granddaughter);
        gt.append(ivanovVasya, Relationship.grandfather, ivanovDima, Relationship.grandson);
        gt.append(ivanovVanya, Relationship.grandfather, ivanovDima, Relationship.grandson);

        gt.append(ivanovDima, Relationship.brother, ivanovaSveta, Relationship.sister);

        Research researchDimaSon = new Research(gt);
        researchDimaSon.spend(ivanovDima, Relationship.son);

        Research researchDimaGrandson = new Research(gt);
        researchDimaGrandson.spend(ivanovDima, Relationship.grandson);

        System.out.println(ivanovaIrina.compareTo(ivanovDima));


        Iterator<Node> iterator = (gt.getTree()).iterator();
        while (iterator.hasNext()) {
            Node next = iterator.next();
            if (next.re != Relationship.son) {
                iterator.remove();
            }
        }
        System.out.println(gt.getTree());
    }

}