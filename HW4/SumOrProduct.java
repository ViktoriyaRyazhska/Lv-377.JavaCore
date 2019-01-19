
public class SumOrProduct {
	private int[] array = { 3, 17, 4, -9, 2, 77, 0, 5, 3, 10 };

	public int[] getArray() {
		return array;
	}

	public static void main(String[] args) {
		final int myLength = 5;
		int indicator = 0;
		int sum = 0;
		int product = 0;

		SumOrProduct my = new SumOrProduct();

		for (int i = 0; i < myLength; i++) {
			if (my.getArray()[i] >= 0) {
				sum += my.getArray()[i];
			} else {
				indicator = -1;
				break;
			}
		}

		if (indicator == 0) {
			System.out.println("Sum of 5 elements: " + sum);
		} else {
			for (int i = myLength; i < my.getArray().length; i++) {
				product *= my.getArray()[i];
			}
			System.out.println("Product of second 5 elements: " + product);
		}

	}

}
