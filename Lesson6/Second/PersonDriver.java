package SoftServe.Lesson6.Second;

public class PersonDriver {
    public static void main(String[] Args) {

//        Person petka = new Student("Петька");
//        Person vaska = new Teacher("Васька");
//        Person mishka = new Cleaner("Мішка");

        Person[] people = {new Student("Петька"), new Teacher("Васька"),
                new Cleaner("Мішка"), new Student("Юрка")};

        for (int i = 0; i < people.length;i++) {
            people[i].print();
            if (people[i] instanceof Stuff) {
                ((Stuff)people[i]).salary();
            }
        }
    }
}
