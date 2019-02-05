package hw7.softserve;

	
		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;
		import java.util.Set;
		import java.util.TreeSet;

		public class Hw73 {

			public static void main(String[] args) throws NumberFormatException, IOException {

				Set<Student> stud =new TreeSet<>(Student.getNameComparator());
				
				stud.add(new Student("Buratinator",1));
				stud.add(new Student("Binokl",2));
				stud.add(new Student("Baton",3));
				stud.add(new Student("Paha",2));
				stud.add(new Student("Malyok",3));
				stud.add(new Student("Kanifol",2));
				
				System.out.println("Sorted by name: ");
				System.out.println(stud);
				
				Set<Student> stud1 = new TreeSet<>(Student.getCourseComparator());
				stud1.addAll(stud);
				System.out.println("Sorted by course: ");
				System.out.println(stud1);
				
				BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Input course num(1-3): ");
				int course = Integer.parseInt(br.readLine());
				
				for (Student i : stud) {
					if (i.getCourse() == course) {
						System.out.println(i);
					}
					
		}

	}

}
