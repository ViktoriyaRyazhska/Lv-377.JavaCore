package SoftServe.Lesson9.Second;

public class PlantDriver {
    public static void main(String[] Args) {
        Plant[] plants = new Plant[4];
        try {
            plants[0] = new Plant(1, "green", "herb");
        } catch (ColorException e) {
            e.printStackTrace();
        } catch (TypeException e) {
            e.printStackTrace();
        }

        try {
            plants[1] = new Plant(10, "yellow", "tree");
        } catch (ColorException e) {
            e.printStackTrace();
        } catch (TypeException e) {
            e.printStackTrace();
        }
        try {
            plants[2] = new Plant(2, "red", "flower");
        } catch (ColorException e) {
            e.printStackTrace();
        } catch (TypeException e) {
            e.printStackTrace();
        }
        try {
            plants[3] = new Plant(500, "brown", "car");
        } catch (ColorException e) {
            e.printStackTrace();
        } catch (TypeException e) {
            e.printStackTrace();
        }

        for (Plant p : plants) {
            System.out.println(p);
        }
    }
}
