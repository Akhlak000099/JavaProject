package CollectionProgram;

import java.util.Comparator;

public class comparetable implements Comparator<Demo1> {
	@Override
	public int compare(Demo1 o1, Demo1 o2) {
		// TODO Auto-generated method stub
		if(o1.Id < o2.Id) {
			return 1;
		}
		return -1;
	}
}
