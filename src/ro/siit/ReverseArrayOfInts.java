package ro.siit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayOfInts {
	Integer[] arr = { 10, 20, 30, 40, 50 };

	public class ArrayHandle {
		public Object[] reverse(Object[] arr) {
			List<Object> list = Arrays.asList(arr);
			Collections.reverse(list);
			return list.toArray();
		}
	}
}
