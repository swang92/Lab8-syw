### Lab 8

**Try using a TreeMap instead of a HashMap. Does this make any difference?**

TreeMap allows us to sort by Key (which in our case is the word). For our purposes, because able to sort on the key doesn't make much difference because we're driven by the words that are used the most. However, it would be helpful if we were trying to sort alphabetically. 

**What happens if you invoke countWords multiple times for different String iterators?**

If you're passing different Scanner input information, then the same method will run for the different sets of input data. If you're running multiple string iterators over the same input data, there's a chance that it could duplicate the count (or triplicate depending on the different string iterators you're running). 

**What crucial role does the Iterator abstraction play in making WordCounter testable?**

Having the Iterator in WordCounter allows us to do counting and reading of the input lines together. This allows us in Main (and in the test class) to just pass the Scanner as a parameter. 