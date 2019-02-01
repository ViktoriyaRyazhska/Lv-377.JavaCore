import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
       List<Students> st = new ArrayList<Students>(5);
       st.add(new Students("Petro",3));
       st.add(new Students("Anna",4));
       st.add(new Students("Ivan",2));
       st.add(new Students("Oleg",3));
       st.add(new Students("Karina",1));
       st.sort(Students.getNameComparator());
       Students.show(st);
       System.out.println();
       st.sort(Students.getCourseComparator());
       Students.show(st);
	}

}

