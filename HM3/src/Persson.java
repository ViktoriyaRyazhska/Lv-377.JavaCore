import java.util.Scanner;
import java.time.LocalDate;
public class Persson {
	Scanner in = new Scanner(System.in);
	private String name;
	private int birthYear;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public Persson(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public Persson() {

	}

	public int age() {
		int age = 0;
		if (birthYear < LocalDate.now().getYear()) {
			age = LocalDate.now().getYear() - birthYear;
		}
		return age;

	}

	public String inPutName() {
		System.out.print("Input your name ");
		name = in.next();
		return name;
	}

	public int inPutBirth() {
		System.out.print("Input your Birth year ");
		birthYear = in.nextInt();
		return birthYear;
	}

	@Override
	public String toString() {
		return "info [name=" + name + ", BirthYear=" + birthYear + ", age=" + age() + "]";
	}

	public String changeName() {
		System.out.print("Pls change your name " + name + " ");
		name = in.next();
		return name;
	}
}
