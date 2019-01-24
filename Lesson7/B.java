package SoftServe.Lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class B {
    public static void main(String[] Args) throws IOException {
        Map<Integer, String> employeeMap = new HashMap<Integer, String>();

        employeeMap.put(01, "Vasay");
        employeeMap.put(02, "Olejka");
        employeeMap.put(03, "Vanka");
        employeeMap.put(04, "Petka");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter ID ");
        int ID = Integer.parseInt(br.readLine());

        if (employeeMap.containsKey(ID)) {
            System.out.println(employeeMap.get(ID));
        } else {
            System.out.println("Sorry, I can't find it ");
        }

        System.out.println("Enter name ");
        String name = br.readLine();

        if (employeeMap.containsValue(name)) {
            System.out.println("Yes, please wait");
            System.out.println(findID(employeeMap, name));
        } else {
            System.out.println("Sorry, I can't find it ");
        }
    }

    static Integer findID(Map<Integer, String> map, String name) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equals(name)) {
                return entry.getKey();
            }
        }
        return null;
    }
}