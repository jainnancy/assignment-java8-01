package edu.knoldus;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Operations {

    Random random = new Random();

    public Template isPrime = number -> {
        for(int i = 2; i < number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    };

    public void printRandomPrime(){
        List<Integer> randomList = Arrays.stream(random.ints(100,0,1000).toArray())
                .boxed().collect(Collectors.toList());
        System.out.println("Random list of Integers is:\n"+ randomList);
        System.out.println("\nPrime numbers are: \n");
        randomList.stream()
                .filter(value -> (new Operations()).isPrime.isTrue(value))
                .forEach(value -> System.out.print(value + " "));
    }

    public void multiplyLists() {
        List<Integer> list1 = Arrays.stream(random.ints(10,0,100).toArray())
                .boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(random.ints(10,0,100).toArray())
                .boxed().collect(Collectors.toList());

        System.out.println("\nList1 =" + list1);
        System.out.println("\nList2 =" + list2);
        System.out.println("\nMultiple: " + IntStream.range(0,10)
                .map(index -> list1.get(index) * list2.get(index))
                .boxed()
                .collect(Collectors.toList()));
    }
}
