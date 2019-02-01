package Lesson9;

public class Plant {
	private Type type;
	private Colors color;
	int size;
	
	
	public Plant(String type, String color, int size) throws ColorException, TypeException {
		Type typ = typeStrToEnum(type);
		Colors col = colorStrToEnum(color);
		this.type=typ;
		this.color = col;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Plant [type=" + type + ", color=" + color + ", size=" + size + "]";
	}

	private static Colors colorStrToEnum(String color) throws ColorException {
		switch (color.toLowerCase()) {
		case "white":
			return Colors.WHITE;
		case "red":
			return Colors.RED;
		case "yellow":
			return Colors.YELLOW;
		default: throw new ColorException("No this color in our list");
		}
	
	}
	
	private static Type typeStrToEnum(String type) throws TypeException  {
		switch (type.toLowerCase()) {
		case "rose":
			return Type.ROSE;
		case "tulip":
			return Type.TULIP;
		case "chamomile":
			return Type.CHAMOMILE;
		default: throw new TypeException("No this type in our list");
		}
	
	}
	
	public static void main(String[] args) {
		Plant []plants = new Plant[2];
	
			try {
				plants[0]= new Plant("rose", "red", 50);
			} catch (ColorException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (TypeException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	
		System.out.println(plants[0]);
		try {
			plants[1]= new Plant("tulip", "red", 35);
		} catch (ColorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

enum Colors {
	RED, YELLOW, WHITE;
}

enum Type {
	ROSE, CHAMOMILE, TULIP;
}
