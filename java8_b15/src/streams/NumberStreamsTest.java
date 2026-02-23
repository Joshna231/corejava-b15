package streams;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class NumberStreamsTest {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(5,16,9,65,14,20,92,18,16,2,7,3,5,4,14,65,10,28,9,20);
				  list.stream()
				  	  .filter(x->x%2==0)	// to apply condition
				  	  .map(x->x*2)			// to apply the logic
				  	  .sorted()				// to sort the objects
				  	  .distinct()			// to remove duplicate objects
				  	  .limit(5)				// limit the result
				  	  .skip(2)				// skip the results
				  	  .forEach(x->System.out.println(x));	// to iterate the objects
				  System.out.println("===========================================");
				  
				  list.stream().forEach(x->System.out.println(x));
				  
				  System.out.println("============collect==============");
				  List<Integer> oddlist=list.stream().filter(x->x%2!=0).collect(Collectors.toList());
				  System.out.println(oddlist);
				  
				  System.out.println("============min===================");
				  int min=list.stream().mapToInt(x->x).min().getAsInt();
				  System.out.println("min: "+min);
				  
				  System.out.println("===============max==================");
				  OptionalInt max=list.stream().mapToInt(x->x).max();
				  System.out.println("max: "+max.getAsInt());
				  
				  System.out.println("================count================");
				  long count=list.stream().count();
				  System.out.println("count: "+count);
				  
				  long sum=list.stream().mapToInt(x->x).sum();
				  System.out.println("sum: "+sum);
				  
				  System.out.println("===============match operations==============");
				  boolean anymatch=list.stream().anyMatch(x->x==2);
				  System.out.println(anymatch);
				  
				  boolean allmatch=list.stream().allMatch(x->x==1);
				  System.out.println(allmatch);
				  
				  boolean nonematch=list.stream().noneMatch(x->x==0);
				  System.out.println(nonematch);
				  
				  System.out.println("================find operations================");
				  Optional<Integer> findany=list.stream().findAny();
				  System.out.println(findany.get());
				  
				  Optional<Integer> findfirst=list.stream().findFirst();
				  System.out.println(findfirst.get());
				  
	System.out.println("================second highest================");			  
				  
				  Optional<Integer> secondnum=list.stream()
					  .filter(x->x!=0)
				  	  .map(x->x)
				  	  .sorted(Comparator.reverseOrder())
				  	  .distinct()
				  	  .skip(1)
				  	  .findFirst();
				  	  System.out.println("SecondHighest Num: "+secondnum.get());
				  	  
	System.out.println("===================Duplicate elements===============");
	
	list.stream()
		.filter(x->x==5 || x==16 ||x==14 ||x==20 ||x==65 ||x==9)
		.map(x->x)
		.sorted(Comparator.naturalOrder())
		.forEach(System.out::println);
				  
}
}




























