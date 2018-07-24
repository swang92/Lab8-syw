# COMP 271   Lab 8

# Team project

Work in teams of two.

# Objectives

An understanding of the following concepts and techniques:

- Set and Map ADTs
- sorting arrays and ArrayLists
- solving problems using existing collections and algorithms
- parameterizing sorting by a comparison strategy
- Iterator, Strategy, and Adapter design patterns

# Instructions

In this lab, you will have the opportunity to complete a tool that counts the frequencies
of the words it reads from the standard input.
The tool then prints the (up to) 10 most frequent words and their frequencies in descending order.

Example:

      ./build/scripts/cs2-lab10-wordcount-java
      asdf oiu qwer
      asdf oiu
      oiu qwer
      qwer oiu
      asdf asdf
      xzc
      EOF (ctrl-D or ctrl-Z)
      asdf=4
      oiu=4
      qwer=3
      xzc=1

Specifically:

1. Complete the TODO items in the various sources until the program behaves as required.
1. Complete the test class `TestWordCount` to provide meaningful tests of the `getCount` method.
   To avoid the need for file input to populate the `WordCounter` instance,
   directly create the desired iterator like so:

        Arrays.asList("asdf", "oiu", "qwer").iterator()

1. Download this book: https://archive.org/stream/lesmisrables01unkngoog/lesmisrables01unkngoog_djvu.txt.
1. Use the program to determine the 10 most frequent words and their frequencies in this text by redirecting stdin from the downloaded file:

       ./build/scripts/cs2-lab10-wordcount-java-solution < lesmisrables01unkngoog_djvu.txt
       word1=freq1 <- results start here
       word2=freq2
       ...

1. Report the results in the written part (Answers.md).
1. Answer the following questions, also in Answers.md:
   - Try using a `TreeMap` instead of a `HashMap`. Does this make any difference?
   - What happens if you invoke `countWords` multiple times for different String iterators?
   - What crucial role does the Iterator abstraction play in making `WordCounter` testable?

# Grading

- 1 submission via GitHub
- 2 completion of items marked TODO in `src/main` and correct behavior
- 1 completion of meaningful tests in `TestWordCount`
- 1 written part
  - 0.8 responses to the questions above
  - 0.2 grammar, style, formatting

*5 points TOTAL*
