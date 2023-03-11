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

        IvanovsGeoTree ivanovsGT = new IvanovsGeoTree();

        ivanovsGT.append(ivanovaIrina, Relationship.mother, ivanovPetya);
        ivanovsGT.append(ivanovVasya, Relationship.father, ivanovPetya);
        ivanovsGT.append(ivanovPetya, Relationship.son, ivanovaIrina);
        ivanovsGT.append(ivanovPetya, Relationship.son, ivanovVasya);

        ivanovsGT.append(ivanovaMasha, Relationship.mother, ivanovaZhenya);
        ivanovsGT.append(ivanovVanya, Relationship.father, ivanovaZhenya);
        ivanovsGT.append(ivanovaZhenya, Relationship.daughter, ivanovaMasha);
        ivanovsGT.append(ivanovaZhenya, Relationship.daughter, ivanovVanya);

        ivanovsGT.append(ivanovaZhenya, Relationship.mother, ivanovaSveta);
        ivanovsGT.append(ivanovPetya, Relationship.father, ivanovaSveta);
        ivanovsGT.append(ivanovaSveta, Relationship.daughter, ivanovPetya);
        ivanovsGT.append(ivanovaSveta, Relationship.daughter, ivanovaZhenya);

        ivanovsGT.append(ivanovaZhenya, Relationship.mother, ivanovDima);
        ivanovsGT.append(ivanovPetya, Relationship.father, ivanovDima);
        ivanovsGT.append(ivanovDima, Relationship.son, ivanovPetya);
        ivanovsGT.append(ivanovDima, Relationship.son, ivanovaZhenya);

        ivanovsGT.append(ivanovaIrina, Relationship.grandmother, ivanovaSveta);
        ivanovsGT.append(ivanovaMasha, Relationship.grandmother, ivanovaSveta);
        ivanovsGT.append(ivanovaIrina, Relationship.grandmother, ivanovDima);
        ivanovsGT.append(ivanovaMasha, Relationship.grandmother, ivanovDima);

        ivanovsGT.append(ivanovVasya, Relationship.grandfather, ivanovaSveta);
        ivanovsGT.append(ivanovVanya, Relationship.grandfather, ivanovaSveta);
        ivanovsGT.append(ivanovVasya, Relationship.grandfather, ivanovDima);
        ivanovsGT.append(ivanovVanya, Relationship.grandfather, ivanovDima);

        ivanovsGT.append(ivanovaSveta, Relationship.granddaughter, ivanovaIrina);
        ivanovsGT.append(ivanovaSveta, Relationship.granddaughter, ivanovaMasha);
        ivanovsGT.append(ivanovaSveta, Relationship.granddaughter, ivanovVasya);
        ivanovsGT.append(ivanovaSveta, Relationship.granddaughter, ivanovVanya);

        ivanovsGT.append(ivanovDima, Relationship.grandson, ivanovaIrina);
        ivanovsGT.append(ivanovDima, Relationship.grandson, ivanovaMasha);
        ivanovsGT.append(ivanovDima, Relationship.grandson, ivanovVasya);
        ivanovsGT.append(ivanovDima, Relationship.grandson, ivanovVanya);

        ivanovsGT.append(ivanovDima, Relationship.brother, ivanovaSveta);
        ivanovsGT.append(ivanovaSveta, Relationship.sister, ivanovDima);

        Research researchDimaSon = new Research(ivanovsGT);
        System.out.println(researchDimaSon.spend(ivanovDima, Relationship.son));

        Research researchDimaGrandson = new Research(ivanovsGT);
        System.out.println(researchDimaGrandson.spend(ivanovDima, Relationship.grandson));

    }

}