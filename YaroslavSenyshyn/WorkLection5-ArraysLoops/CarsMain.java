package HomeworkArrayLoops;

public class CarsMain {

	public static void main(String[] args) {
		Cars[] carArray = new Cars[4];
		carArray[0] = new Cars("Jetta", 2011, 100);
		carArray[1] = new Cars("Passat", 2015, 120);
		carArray[2] = new Cars("Amarok", 2015, 200);
		carArray[3] = new Cars("PassatCC", 2017, 110);

		Cars.findYear(carArray, 2015);
		System.out.println();
		Cars.print(carArray);
		Cars.sort(carArray);
		System.out.println();
		Cars.print(carArray);
	}

}
