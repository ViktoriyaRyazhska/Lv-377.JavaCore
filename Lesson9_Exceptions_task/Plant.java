package Lesson9_Exceptions_task;

public class Plant {

	public int size;
	public PlantColor color;
	public PlantType type;

	public Plant(int size, String color, String type) throws ColorException, TypeException {
		this.size = size;
		this.color = colorToString(color);
		this.type = typeToString(type);
	}

	private static PlantColor colorToString(String color) throws ColorException {
		switch (color) {
		case "blue":
			return PlantColor.BLUE;
		case "red":
			return PlantColor.RED;
		case "yellow":
			return PlantColor.YELLOW;
		default:
			throw new ColorException("Wrong plant color.");
		}
	}

	private static PlantType typeToString(String type) throws TypeException {
		switch (type) {
		case "cornflower":
			return PlantType.CORNFLOWER;
		case "chamomile":
			return PlantType.CHAMOMILE;
		case "cactus":
			return PlantType.CACTUS;
		case "rose":
			return PlantType.ROSE;
		default:
			throw new TypeException("Wrong plant type.");
		}
	}

	@Override
	public String toString() {
		return "Plant size = " + size + ", color = " + color + ", type = " + type;
	}

}
