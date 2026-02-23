package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsTest {
	public static void main(String[] args) {
		Employee e1 = new Employee(100, "Joshna", "Java", 250000l, "Hyderabad");
		Employee e2 = new Employee(108, "Adam", "Aws", 150000l, "Chennai");
		Employee e3 = new Employee(104, "Kumari", "Java", 320000l, "Banglore");
		Employee e4 = new Employee(102, "Lavanya", "Python", 50000l, "Hyderabad");
		Employee e5 = new Employee(101, "Kavya", "Sql", 120000l, "Chennai");
		Employee e6 = new Employee(107, "Sravanthi", "Java", 250000l, "Banglore");
		Employee e7 = new Employee(105, "Kaveri", "Sql", 130000l, "Hyderabad");
		Employee e8 = new Employee(110, "Bharath", "Devops", 50000l, "Kolkata");
		Employee e9 = new Employee(103, "Harika", "Aws", 95000l, "Chennai");
		Employee e10 = new Employee(109, "Nageena", "Python", 80000l, "Hyderabad");

		List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
		
		//-------------------------to List()---------------------------------//
		List<Employee> javaemplist = list.stream()
									     .filter(x -> x.getDept().equalsIgnoreCase("java"))
									     .collect(Collectors.toList());
										System.out.println(javaemplist);
		
		//-------------------------to Set()---------------------------------//								
		Set<String> set = list.stream()
						   // .map(x->x.getDept())
							  .map(Employee::getDept)
							  .collect(Collectors.toSet());
							System.out.println(set);

		//-------------------------to Map()---------------------------------//					
		Map<Integer, String> map = list.stream()
									 //.collect(Collectors.toMap(x -> x.getPid(), x -> x.getPname()));
									   .collect(Collectors.toMap(Employee::getPid, Employee::getPname));
									System.out.println(map);

		Map<Integer, Employee> empmap = list.stream()
				// .collect(Collectors.toMap(x->x.getPid(), Function.identity()));
				.collect(Collectors.toMap(Employee::getPid, Function.identity()));
		System.out.println(empmap);
		
		//-------------------------to Collect()----------------------------//
		LinkedList<Employee> Linkedlist=list.stream()
									     // .collect(Collectors.toCollection(()->new LinkedList<Employee>()));
											.collect(Collectors.toCollection(LinkedList::new));
											System.out.println(Linkedlist);
		
		//-----------------------toJoining()------------------------------//
		String names=list.stream()
						 .map(Employee::getPname)
						 .collect(Collectors.joining(", "));
						System.out.println(names);
		
		//-----------------------counting()------------------------------//
		long count=list.stream()
					   .filter(x->x.getDept().equalsIgnoreCase("java"))
					   .collect(Collectors.counting());
						System.out.println(count);
						
		//-----------------------collectandthen------------------------//
		LinkedHashMap<Integer, Employee> linkedhashmap=list.stream()
			.collect(Collectors.collectingAndThen
			(Collectors.toMap(Employee::getPid, Function.identity()), LinkedHashMap::new));
		   System.out.println("linkedhashmap: "+linkedhashmap);
		   
		   LinkedHashSet<String> linkedhashset=list.stream()
		   	   .map(Employee::getPname)
		   	   .collect(Collectors.collectingAndThen(Collectors.toSet(), LinkedHashSet::new));
		   System.out.println("linkedhashset: "+linkedhashset);
		   
		   ArrayList<String> arraylistdata=list.stream()
		   	   .map(Employee::getCity)
		   	   .collect(Collectors.collectingAndThen(Collectors.toList(), ArrayList::new));
		   System.out.println("arraylistdata: "+arraylistdata);
		   
		//-------------------------maxby & minby----------------------//
		   Optional<Long> max=list.stream()
		   	   .map(Employee::getSalary)
		   	   .collect(Collectors.maxBy(Comparator.naturalOrder()));
		   System.out.println("max: "+max.get());
		   
		   Optional<Long> min=list.stream()
			   	   .map(Employee::getSalary)
			   	   .collect(Collectors.minBy(Comparator.naturalOrder()));
			   System.out.println("min: "+min.get());
		
		//---------------------summingint,summingdouble,summinglong----------//
		double sum=list.stream()
			.map(Employee::getSalary)
			.collect(Collectors.summingDouble(x->x));
		System.out.println(sum);
		
		int sum1=list.stream()
				.map(Employee::getPid)
				.collect(Collectors.summingInt(x->x));
		System.out.println(sum1);
		
		long sum2=list.stream()
				.map(Employee::getSalary)
				.collect(Collectors.summingLong(x->x));
		System.out.println(sum2);
		
	//----------------averageint,averagelong,averagedouble---------------------//
		Double avg=list.stream()
			.map(Employee::getPid)
			.collect(Collectors.averagingInt(x->x));
		System.out.println(avg);
		
		Double avg1=list.stream()
				.map(Employee::getSalary)
				.collect(Collectors.averagingLong(x->x));
			System.out.println(avg1);
		
			Double avg2=list.stream()
					.map(Employee::getSalary)
					.collect(Collectors.averagingDouble(x->x));
				System.out.println(avg2);
		
	//-----------------summarizingint,long,double----------------------------//
		DoubleSummaryStatistics dss=list.stream()
			.map(Employee::getSalary)
			.collect(Collectors.summarizingDouble(x->x));
		System.out.println("min: "+dss.getMin());
		System.out.println("Max: "+dss.getMax());
		System.out.println("Sum: "+dss.getSum());
		System.out.println("Count: "+dss.getCount());
		System.out.println("Avg: "+dss.getAverage());
		
	//----------------------Groupingby---------------------------------//
		Map<String, List<Employee>> groupby=list.stream()
			.collect(Collectors.groupingBy(Employee::getDept));
		System.out.println(groupby);
		
		Map<String, Long> count1=list.stream()
			.collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
		System.out.println("Dept Counting: "+count1);
		
	//---------------------Partitioningby----------------------------//
		Map<Boolean, List<Employee>> partitionby=list.stream()
			.collect(Collectors.partitioningBy(x->x.getSalary()>260000));
		System.out.println(partitionby);
		
		
		Map<String, Double> deptavg=list.stream()
			.collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingDouble(x->x.getSalary())));
		System.out.println("dept avg: "+deptavg);
		
		
		//for(Entry<Integer, String> entry:map.entrySet()) {
			//System.out.println(entry);
		
		Map<String, Long> count2=list.stream()
				.collect(Collectors.groupingBy(Employee::getPname, Collectors.counting()));
			System.out.println("Dept Counting: "+count2);

	System.out.println("======================================================");		
			long counts2=list.stream()
				.filter(x->x.getDept()=="Java")
				.collect(Collectors.counting());
				//.forEach(System.out::println);
			 System.out.println(counts2);
		}
		
	}






















