package CollectionsGeneric;

import java.util.Comparator;

public class CompareName implements Comparator<Task5Students>{

	@Override
	public int compare(Task5Students o1, Task5Students o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
