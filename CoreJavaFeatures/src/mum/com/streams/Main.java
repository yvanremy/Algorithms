package mum.com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	
	public static void main(String...r) {
		
		List<Student> students = Arrays.asList(new Student(101,"kamana",79,"pass"),
				new Student(208,"mukanizi",92,"pass"),
				new Student(200,"Baganizi",52,"fail"),
				new Student(118,"Mugenzi",45,"fail"),
				new Student(330,"Kalisa",88,"pass"),
				new Student(273,"Uwera",79,"pass"),
				new Student(198,"Mukamana",90,"pass"),
				new Student(212,"Vuguziga",41,"fail"),
				new Student(333,"Rugendo",65,"fail"),
				new Student(111,"Rusarwa",86,"pass"));
		
		String eclipse = "This sia eclipse random Eclipse eclipse ecliPse not a valid ECLIPSE sdfdsf sdfd";
		
		Map<String, Long> variations =Arrays.asList(eclipse.split("\\s+")).stream().filter(s -> s.equalsIgnoreCase("eclipse")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		
		Stream<String> stringStream = Stream.of("hagenimana","yvan", "remy","kamana","abimana","kabega","babyeyi","kevin").sorted((a,b)->{return  b.compareTo(a);});
		//stringStream.sorted((a,b)->{return  a.compareTo(b);});
		List<String> stringList = stringStream.map(x-> x.toUpperCase()).collect(Collectors.toList());
		
		double average = students.stream().map(x-> x.getGrade()).reduce(0.0,(x,s) ->x+s);
		
		//stringList.forEach(System.out :: println);
		
		//System.out.println(average);
		
		variations.entrySet().forEach((v)->{
			System.out.println(v.getKey()+" --- "+v.getValue());
		});
		
		
		
	}

}
