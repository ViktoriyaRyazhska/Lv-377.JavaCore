package Exceptions;

import Exceptions.Plant.Color;

public class Plant {
	private Type type;
	private Color color;
	private int size;

	public Plant(String type, String color, int size) throws MyExceptions {
		this.size = size;
		this.type = Typed(type);
		this.color = Colored(color);

	}

	public enum Color {
		white, blue, yellow
	}

	enum Type {
		rose, lilac, dracena
	}

	private static Color Colored(String color) throws MyExceptions {
		switch (color) {
		case "white":
			return Color.white;
		case "blue":
			return Color.blue;
		case "yellow":
			return Color.yellow;

		default:
			throw new MyExceptions("Wrong color");
		}
	}

	private static Type Typed(String type) throws MyExceptions {
		switch (type) {
		case "rose":
			return Type.rose;
		case "lilac":
			return Type.lilac;
		case "dracena":
			return Type.dracena;

		default:
			throw new MyExceptions("Wrong type");
		}
	}

	@Override
	public String toString() {
		return "Plant type= " + type + ", color= " + color + ", size= " + size;
	}

}
