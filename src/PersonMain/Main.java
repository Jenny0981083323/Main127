package PersonMain;

public class Main {
    public static void main(String[] args) {
        Person p1=new Person("Jenny",39);
        Person p2=new Person("Jen",39);
        Person p3=new Person("Je",39);
        p1.talk();
        p2.setSpouse(p3);
        p3.setSpouse(p2);
        p2.talk();
    }
}
