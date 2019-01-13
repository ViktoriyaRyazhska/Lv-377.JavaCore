package SoftServe.Second.HomeWork;

public class PersonDriver {
    public static void main(String[] Args) {
        Person Andy = new Person("Енді", 1989);
        Person Ivan = new Person("Іван", 1990);
        Person Roman = new Person();
        Person Peter = new Person();
        Person Vasya = new Person();

        Roman.input("Роман", 1985);
        Peter.input("Петер",1980);
        Vasya.input("Василь", 1995);

        System.out.println(Andy.output());
        System.out.println(Ivan.output());
        System.out.println(Roman.output());
        System.out.println(Peter.output());
        System.out.println(Vasya.output());

        Peter.changeName("Петро");
        System.out.println(Peter.output());
    }
}
