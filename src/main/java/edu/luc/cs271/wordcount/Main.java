package edu.luc.cs271.wordcount;

import java.util.*;

public class Main {

  public static void main(final String[] args) throws InterruptedException {

    final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");
     Map<String, Integer> theMap = new HashMap<>();

    // 1. create a WordCounter instance
    WordCounter bookCounter = new WordCounter(theMap);

    // 2. use this to count the words in the input
    bookCounter.countWords(input);

    // 3. determine the size of the resulting map
    int mapSize = bookCounter.getCounts().size();

    // 4. create an ArrayList of that size and
    List <Map.Entry<String,Integer>> myList = new ArrayList<>(mapSize);

    // 5. store the map's entries in it (these are of type Map.Entry<String, Integer>
    Set s = theMap.entrySet();
    myList.addAll(s);

    // 6. sort the ArrayList in descending order by count
    Collections.sort(myList, new DescendingByCount());
    //    using Collections.sort and an instance of the provided comparator (after fixing the latter)

    // 7. print the (up to) ten most frequent words in the text
    for (int i=0; i<10; i++) {
      System.out.println(myList.get(i).toString());
    }
  }
}
