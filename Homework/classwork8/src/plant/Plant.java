package plant;

public class Plant {
	
	private int size;
	private Color color;
	private Type type;
	
	public Plant(int size, String color, String type) throws ColorException, TypeException {
		Color col = colorstrToEnam(color);
		Type typ = typestrToEnam(type);
		this.size = size;
		this.color = col;
		this.type = typ;
	}

	private Type typestrToEnam(String type) throws TypeException {
		switch (type.toLowerCase()) {
		case "flower":
			return Type.Flower;
//			break;
		case "tree":
			return Type.Tree;
//			break;

		default:
			throw new TypeException("Input only type flower or tree");
		}
//		return null;
	}

	private Color colorstrToEnam(String color) throws ColorException {
		switch (color.toLowerCase()) {
		case "red":
			return Color.RED;
//			break;
		case "green":
			return Color.GREEN;
//			break;
		case "pink":
			return Color.PINK;
//			break;

		default:
			throw new ColorException("Input only color green, red or pink");
		}
//		return null;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Plant [size=" + size + ", color=" + color + ", type=" + type + "]";
	}
	
	

}
