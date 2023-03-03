package com.kamlesh;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		int[] intArr = {2,5,7,2,10,25,7,12,10,25};
		Stream stream = Arrays.stream(intArr).boxed();
		stream.distinct().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
	}

}
