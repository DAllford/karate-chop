# karate-chop

An attempt at the kata given at http://codekata.com/kata/kata02-karate-chop/.

Day 1 is an exploration of the JUnit testing (using both theories and paramaterised tests)

Day1 Errors Log:
When selecting the sublist to the right of the midpoint to continue my search, I forgot to track the midpoint value and add these midpoints to the result of the final chop. 

eg/ chop(12, [1,11,12]) returned 0 because after the first recurse we now perform chop(12, [12]) returning 0, but we should add on the position of the initial chop to get 2
