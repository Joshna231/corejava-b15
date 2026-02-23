package streams;

import java.util.Arrays;
import java.util.List;

public class FlatMapTest {
public static void main(String[] args) {
	List<Integer> list1=Arrays.asList(2,4,6,8,10);
	List<Integer> list2=Arrays.asList(12,14,16,18,20);
	List<Integer> list3=Arrays.asList(22,24,26,28,30);
	
	List<List<Integer>> list=Arrays.asList(list1,list2,list3);
	
	list.stream()
		.flatMap(x->x.stream())
		.forEach(System.out::println);

}
}
