package mum.com.functionalProgramming;
import java.util.function.BiFunction;
import java.util.function.Consumer;
 
 public class Main extends A {
	 
	 
	
	public static void main(String...args) {
		
		int a = 2;
		int v = 5;
		double d ;
		Main t = new Main();
		
//	   	BiFunction<Integer, Integer, Integer> f = (a,b)-> a*b;
//		TrialInterface inter = new TrialInterface(){
//			@Override
//			public void display() {
//				System.out.println("this is the functional interface");
//			}
//		};
//		System.out.println("this is the builtin bifunctional :: "+f.apply(4, 5));
//		TrialInterface inter2 = ()->{System.out.println("this is the real lambda expression");};
//		inter.display();
//		inter2.display();
//		System.out.println("this is the main class in java");
//		"this is the real".replace("e", "t");
//		getConsumer("Remy","hagenimana").accept("this");
		
		d = 3+a /v+2;
		
		System.out.print(d);
	}
	public static Consumer<String> getConsumer(String a , String b){
		return s-> System.out.println("this is A "+a+"this is B "+b);
	}
}
