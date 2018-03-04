package edu.knoldus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.AbstractMap.SimpleEntry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class WordCount {

    public void countWordsFromFile(String filePath) {

        File file = new File(filePath);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String inputData;
            String allData = "";
            while ((inputData = reader.readLine()) != null) {
                allData = allData.concat(inputData + " ");
            }
            Map<String, Long> wordCount = Arrays.stream(allData.split(" "))
                    .map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase().trim())
                    .filter(word -> word.length() > 0)
                    .map(word -> new SimpleEntry<>(word, 1))
                    .collect(groupingBy(SimpleEntry::getKey, counting()));
            System.out.println("\nkey as the common word and values as the count:");
            wordCount.forEach((k, v) -> System.out.println(String.format("%s ==>> %d", k, v)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void countWordsFromSentence(String sentence) {

        List<String> wordList = Arrays.stream(sentence.split(" "))
                .map(word -> word.toLowerCase()).collect(Collectors.toList());
        List<List<String>> wordCount = new ArrayList<>();

        IntStream.range(0, wordList.size()).forEach(index -> {
            String word = wordList.get(index);

            if (wordList.indexOf(word) == index) {
                List<String> tempList = new ArrayList<>();
                tempList.add(word);
                tempList.add(Collections.frequency(wordList, word) + "");
                wordCount.add(tempList);
            }
        });
        System.out.println(wordCount);
/*
        System.out.println(Arrays.stream(sentence.split(" "))
                .map(word -> word.toLowerCase())
        .collect(groupingBy(word -> word,counting())));*/
    }

}
