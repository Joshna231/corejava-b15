package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StringStreamsTest {
public static void main(String[] args) {
	List<String> list=Arrays.asList("Joshna","Lavanya","Bhaskar","Adam","Kumari","Nageena","Bargavi","Bhaskar","Bharath");
				 list.stream()
				 	 .filter(x->x.startsWith("B"))
				 	 .map(x->x)
				 	 .distinct()
				 	 .limit(3)
				 	 .skip(0)
				 	 .forEach(x->System.out.println(x));
				 
			System.out.println("=============================================================");	 
				 list.stream().forEach(x->System.out.println(x));
				 
				 List<String> collect=list.stream().filter(x->x.endsWith("a")).collect(Collectors.toList());
				 System.out.println("Collect: "+collect);
				 
				 int min=list.stream().mapToInt(x->x.length()).min().getAsInt();
				 System.out.println("Min: "+min);
				 
				 int max=list.stream().mapToInt(x->x.length()).max().getAsInt();
				 System.out.println("Max: "+max);
				 
				 long count=list.stream().count();
				 System.out.println("Count: "+count);
				 
				 int sum=list.stream().mapToInt(x->x.length()).sum();
				 System.out.println("Sum: "+sum);
				 
				 boolean anymatch=list.stream().anyMatch(x->x.contains("B"));
				 System.out.println("Anymatch: "+anymatch);
				 
				 boolean allmatch=list.stream().allMatch(x->x.contains("a"));
				 System.out.println("Allmatch: "+allmatch);
				 
				 boolean nonematch=list.stream().noneMatch(x->x.contains("z"));
				 System.out.println("NoneMatch: "+nonematch);
				 
				 Optional<String> findany=list.stream().findAny();
				 System.out.println("FindAny: "+findany.get());
				 
				 Optional<String> findfirst=list.stream().findFirst();
				 System.out.println("FindFirst: "+findfirst.get());
		
		System.out.println("=========================================================");		 
}
}






















