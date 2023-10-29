package com.tns.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Integer[] values =new Integer[] {1,2,3};
        Stream<Integer>stream=Arrays.stream(values);
        //map functiom
        System.out.println("square of no"+Arrays.toString(values));
        stream.map(num->num*num).forEach(System.out::println);
        //limit returns first 2 elements
        System.out.println("first two elements");
        Arrays.stream(values).limit(2).forEach(System.out::println);
        //skip first 2 elements
        System.out.println("skip first two elements");
        Arrays.stream(values).skip(2).forEach(System.out::println);
        //distinct elements
        List<Integer>list=Arrays.asList(1,2,2,3,4,5,6,7,5,5,8);
        System.out.println("distinct elements");
        list.stream().distinct().forEach(System.out::println);
        //count distinct
        System.out.println("count distinct elements:");
       long c = list.stream().distinct().count();
       System.out.println(c);
	    //count  elements
       System.out.println("count the elements:");
       long d=list.stream().count();
       System.out.println(d);
       //uppercase conversion
       List<String> letters=Arrays.asList("sun","moon","stars");
       Stream<String> stream1=letters.stream();
       System.out.println("convert to upper");
       List<String> l1=stream1.map(str->str.toUpperCase()).collect(Collectors.toList());
       System.out.println(l1);
       //filter operation
       List<Integer> l2=Arrays.asList(1,2,3,4,5,6,7,34);
       Stream<Integer>stream2=l2.stream();
       System.out.println("even numbers:");
      l2.stream().filter(num->num%2==0).forEach(System.out::println);
	}

}
