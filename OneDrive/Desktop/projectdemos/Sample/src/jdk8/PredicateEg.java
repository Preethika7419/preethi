package jdk8;

import java.util.function.Predicate;

public class PredicateEg {

	public static void main(String[] args) {
		
		Predicate<Integer> p1=i->(i>18);
		Predicate<Integer> p2=i->(i%2==0);
		System.out.println(p1.test(2));
		System.out.println(p2.test(57));
		
		Predicate<String> s=Predicate.isEqual("Preethi");
		System.out.println(s.test("Preethi"));
		

	}

}
