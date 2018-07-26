package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class TestWordCounter {

   WordCounter fixture;

  @Before
  public void setUp() {
    Map<String, Integer> testMap = new HashMap<>();
    fixture = new WordCounter(testMap);
  }

  @After
  public void tearDown() { fixture = null;
  }

  @Test
  public void testGetCountEmpty() {
    assertTrue(fixture.getCounts().isEmpty());
  }

  @Test
  public void testGetCountNonEmpty() {

    List<String> testList = new ArrayList<>();
    testList.add("Hello");
    testList.add("how");
    testList.add("how");
    testList.add("are");
    testList.add("you");

    Iterator<String> iterator = testList.iterator();

    fixture.countWords(iterator);

    assertEquals(fixture.getCount("Hello"), -1);
    assertEquals(fixture.getCount("how"), 1);
    assertEquals(fixture.getCount("are"), 1);
    assertEquals(fixture.getCount("data"), -1);


    // TODO run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator
  }
}
