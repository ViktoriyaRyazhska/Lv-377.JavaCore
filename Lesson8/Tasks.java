package SoftServe.Lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tasks {
    public static void main(String[] Args) throws IOException {
        String s1 = "IT";
        String s2 = "Lviv IT Academy";
        //System.out.println(s2.startsWith(s1));
        System.out.println(s2.contains(s1));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter surename, name, lastname");
        String inS = br.readLine();

        String[] personalInfo;
        personalInfo = inS.split("[ ,.]");
        surenameInitials(personalInfo);
        name(personalInfo);
        nameMiddlenameLastname(personalInfo);

        System.out.println("Enter name ");
        String name = br.readLine();
        System.out.println(checkName(name));
    }

    static String checkName(String name) {
//        if (!(name.length() >= 3 && name.length() <= 15)) {
//            return "Sorry, you wrote invalid name";
//        }

        Pattern p = Pattern.compile("[A-Za-z0-9_]{3,15}");
        Matcher m = p.matcher(name);
        if (m.matches()) {
            return "Your name is valid (OK) ";
        }
        return "Sorry, you wrote invalid name";
    }

    static void nameMiddlenameLastname(String[] personalInfo) {
        System.out.println(personalInfo[0]+" "+personalInfo[2]+" "+personalInfo[1]);
    }

    static void name(String[] personalInfo) {
        System.out.println(personalInfo[1]);
    }

    static void surenameInitials(String[] personalInfo) {
        System.out.println(personalInfo[0]+" "+personalInfo[1].charAt(0)+". "+personalInfo[2].charAt(0)+".");
    }
}
