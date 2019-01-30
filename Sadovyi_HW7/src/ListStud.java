import java.util.ArrayList;
import java.util.List;

public class ListStud{
	

		

		public static void main(String[] args) {
			List<Student>  studList=new ArrayList<Student>();
			 studList.add(new Student("Ivan",3));
			 studList.add(new Student("Petro",2));
			 studList.add(new Student("Vasul",1));
			 studList.add(new Student("Ihor",5));
			 studList.add(new Student("Dmutro",4));
			
			 
			
			 for (Student student : studList) { 
				 System.out.println(student);
			}
			 System.out.println();
			 studList.sort(new NameComparator());
			 for (Student student : studList) { 
				 System.out.println(student);
			}
			 System.out.println();
			 studList.sort(new CourComparator());
			 for (Student student : studList) { 
				 System.out.println(student);
			 }
			 
			
			
		}

	
	
	
	
	



		
	
}
