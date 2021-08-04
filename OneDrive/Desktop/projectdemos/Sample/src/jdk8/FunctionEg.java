package jdk8;

import java.util.function.Function;

public class FunctionEg {
	public static void main(String args[])
    {
        Function<Integer, Double> half = a -> a / 2.0;
        System.out.println(half.apply(20));  
      
        //half = half.andThen(a -> 3 * a);//10*3
        half = half.compose(a -> 3 * a);
  
        System.out.println(half.apply(20));
        System.out.println(Function.identity());
//		Function<String,Integer> f1=s->s.length();
//		Function<String,String> f2=s->s.toLowerCase();
//		System.out.println(f1.apply("Capgemini"));
//		System.out.println(f2.apply("SYstem"));
    }

}
