package edu.knoldus;


import java.util.Scanner;

public class Initiator {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        //Ass-1 Create a List<Integer>(with 100 elements) of random number and then filter the prime numbers out of it.
        new Operations().printRandomPrime();

        //Ass-2 read the contents of a file and return a Map<String, String> with key as the common word and values as the count.
        //example file path = //home/knoldus/Desktop/Assignments_kip/Assignment Java8 KIP-2018.txt
        System.out.print("\nEnter the File path: ");
        String filePath;
        filePath = scan.nextLine();
        new WordCount().countWordsFromFile(filePath);

        //Ass-3 Count the number of each word in a sentence and return a list like below
        System.out.print("\nEnter the sentence: ");
        String sentence = scan.nextLine();
        new WordCount().countWordsFromSentence(sentence);

        //Ass-4
        new Operations().multiplyLists();

        //Ass-5
        new MovieOperations().displayFilteredList();
    }
}
