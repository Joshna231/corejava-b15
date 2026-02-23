package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.stream.Collectors;

public class Employee {
	int pid;
	String pname;
	String dept;
	long salary;
	String city;

	public Employee(int pid, String pname, String dept, long salary, String city) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.dept = dept;
		this.salary = salary;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [pid=" + pid + ", pname=" + pname + ", dept=" + dept + ", salary=" + salary + ", city=" + city
				+ "]";
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

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
		// Comparator<Employee> bysalary=(o1,o2) -> o1.salary.compareTo(o2.salary);
		// Collections.so
		// list.stream().forEach(System.out::println);
		list.stream()
			.filter(x -> x.getDept() != null)
			.map(x -> x.getDept())
			.sorted().distinct()
			.limit(5)
			.skip(0)
			.forEach(x -> System.out.println(x));
		System.out.println("============================================");

		list.stream().forEach(x -> System.out.println(x));
		long countdept = list.stream().map(x -> x.getDept() == "Java").distinct().count();
		System.out.println("count dept: " + countdept);

		List<Employee> collect = list.stream().filter(x -> x.getPname().equals("Adam")).collect(Collectors.toList());
		System.out.println("collect: " + collect);

		OptionalLong min = list.stream().mapToLong(x -> x.salary).min();
		System.out.println("Min salary: " + min.getAsLong());

		OptionalLong max = list.stream().mapToLong(x -> x.salary).max();
		System.out.println("Max salary: " + max.getAsLong());

		long count = list.stream().count();
		System.out.println("Count: " + count);

		long sum = list.stream().mapToLong(x -> x.salary).sum();
		System.out.println("Sum: " + sum);

		boolean anymatch = list.stream().anyMatch(x -> x.dept == "Java");
		System.out.println("Anymatch: " + anymatch);

		boolean allmatch = list.stream().allMatch(x -> x.getSalary()!=0);
		System.out.println("Allmatch: " + allmatch);

		boolean nonematch = list.stream().noneMatch(x -> x.city == "Guntur");
		System.out.println("Nonematch: " + nonematch);

		Optional<Employee> findany = list.stream().findAny();
		System.out.println("Findany: " + findany.get());

		Optional<Employee> findfirst = list.stream().findFirst();
		System.out.println("Findfirst: " + findfirst.get());

		System.out.println("===========Second Highest Salary===========");

		long SecondHighestSalary = list.stream()
				.map(x -> x.getSalary())
				.sorted(Comparator.reverseOrder())
				.distinct()
				.skip(1)
				.findFirst().get();
		System.out.println("Second Highest Salary: "+SecondHighestSalary);
		
		System.out.println("===============Dept Count==============");
		long deptcount1=list.stream().filter(x->x.getDept().equals("Java"))
						   .map(x->x.getPid())
						   .distinct()
						   .sorted()
						   .count();
				System.out.println("Java Developers: "+deptcount1);
				
				long deptcount2=list.stream().filter(x->x.getDept().equals("Aws"))
						   .map(x->x.getPid())
						   .distinct()
						   .sorted()
						   .count();
				System.out.println("AWS Developers: "+deptcount2);
				
				long deptcount3=list.stream().filter(x->x.getDept().equals("Python"))
						   .map(x->x.getPid())
						   .distinct()
						   .sorted()
						   .count();
				System.out.println("Python Developers: "+deptcount3);
				
				long deptcount4=list.stream().filter(x->x.getDept().equals("Sql"))
						   .map(x->x.getPid())
						   .distinct()
						   .sorted()
						   .count();
				System.out.println("SQL Developers: "+deptcount4);
				
				long deptcount5=list.stream().filter(x->x.getDept().equals("Devops"))
						   .map(x->x.getPid())
						   .distinct()
						   .sorted()
						   .count();
				System.out.println("Devops Developers: "+deptcount5);

	}
}























