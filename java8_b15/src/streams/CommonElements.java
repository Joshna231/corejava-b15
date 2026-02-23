package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommonElements {
	
	
	
public static void main(String[] args) {
	List<Integer> list1=Arrays.asList(1,2,3,4);
	List<Integer> list2=Arrays.asList(3,4,5,6);
	
	List<Integer> common=list1.stream()
		 .filter(list2::contains)
		 .collect(Collectors.toList());
	System.out.println("Common Elements: "+common);
	
	
	System.out.println("============================================================");
	List<Integer> l1=Arrays.asList(7,10,2,6,20,14,7,5,22,6,8,3,2,10,5,14);
	Set<Integer> set1=new HashSet<>();
	
	List<Integer> duplicate=l1.stream()
	  .filter(x->!set1.add(x))
	  .sorted()
	  .collect(Collectors.toList());
	System.out.println("Duplicate Elements: "+duplicate);
	
	System.out.println("==========================================================");
	List<Integer> l2=Arrays.asList(98,65,2,10,5,18,35,120,135,92);
	
	Optional<Integer> secondnum=l2.stream()
	  .filter(x->x!=0)
	  .sorted(Comparator.reverseOrder())
	  .skip(1)
	  .findFirst();
	System.out.println("Second Highest Num: "+secondnum.get());
	
	System.out.println("==========================================================");
	
	List<String> l3=Arrays.asList("joshna","lavanya","bhaskarao","adam","kumari");
	
	String longname=l3.stream()
	  .max(Comparator.comparingInt(String::length))
	  .get();
	System.out.println("Long String: "+longname);
	
	System.out.println("==========================================================");
	String name="Java";
	
	Map<Object, Long> charname=IntStream.range(0, name.length())
			 .mapToObj(name::charAt)
			 .sorted()
			 .collect(Collectors.groupingBy(x->x, Collectors.counting()));
	System.out.println("char count: "+charname);
}
}
























