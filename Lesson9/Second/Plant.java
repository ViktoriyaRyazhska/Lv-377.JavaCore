package SoftServe.Lesson9.Second;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, String color, String type) throws ColorException, TypeException {
        this.size = size;
        this.color = colorConvert(color);
        this.type = typeConvert(type);
    }

    private static Type typeConvert(String type) throws TypeException {
        switch (type.toLowerCase()) {
            case "flower": return Type.flower;
            case "tree": return Type.tree;
            case "herb": return Type.herb;
            default:throw new TypeException("Неправильний тип \"" + type + "\"");
        }
    }

    private static Color colorConvert(String color) throws ColorException {
        switch (color.toLowerCase()) {
            case "red": return Color.red;
            case "green": return Color.green;
            case "yellow": return Color.yellow;
            default: throw new ColorException("Неправильний колір \"" + color + "\"");
        }
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
