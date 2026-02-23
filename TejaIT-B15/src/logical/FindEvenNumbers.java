package logical;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumbers {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(12,10,18,17,9,6,15);
	list.stream().filter(x->x%2==0).forEach(System.out::println);
}
}
