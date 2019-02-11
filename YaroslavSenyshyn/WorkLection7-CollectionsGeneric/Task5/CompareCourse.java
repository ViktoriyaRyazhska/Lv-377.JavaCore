package CollectionsGeneric;

import java.util.Comparator;

public class CompareCourse implements Comparator<Task5Students>{

	@Override
	public int compare(Task5Students o1, Task5Students o2) {

		return (o1.getCourse()-o2.getCourse());
	}

}
