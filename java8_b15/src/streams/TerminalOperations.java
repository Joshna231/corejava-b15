package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TerminalOperations {
public static void main(String[] args) {
	IntStream.range(0, 15).forEach(System.out::println);
	
	System.out.println("==============================================");
	
	IntStream.range(10, 20).parallel().forEach(System.out::println);
	
	IntStream.range(20, 30).parallel().forEachOrdered(System.out::println);
	
	System.out.println("===================To Array===========================");
	
	List<Integer> list=Arrays.asList(12,14,15,17,19);
	Object[] arr1=list.toArray();
	Object[] arr2=list.stream().toArray();
	Object[] arr3=list.stream().toArray(x->new Integer[x]);
	Object[] arr4=list.stream().toArray(Integer[]::new);
	
	System.out.println("====================reduce===========================");
	
	int sum=list.stream().reduce((x,y)->x+y).get();
	System.out.println(sum);
	
	int sum1=list.stream().reduce((x,y)->Integer.min(x, y)).get();
	System.out.println(sum1);
	
	int sum2=list.stream().reduce(Integer::max).get();
	System.out.println(sum2);
}
}
