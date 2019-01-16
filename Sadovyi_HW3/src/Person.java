import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Person {
		
		private String name;
		private int birthYear;
		LocalDate localDate = LocalDate.now();
		int yer = localDate.getYear();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		public Person(String name, int birthYear) {
			this.name = name;
			this.birthYear = birthYear;
		}
		public Person() {
		};
		int age() {
		return (yer-birthYear);
		}
		public void input() throws Exception, IOException {
			System.out.println(name + " birth year");
			birthYear = Integer.parseInt(br.readLine());
		}
		public void output() {
			System.out.println("name " + name + ", birthYear " + birthYear + ", age " + age());
		}
		
		public void changeName() throws IOException {
			System.out.println("Name " + name);
			System.out.println("New name: " );
			name = br.readLine();
			output();
		}
		
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
}


