# karate-chop

An attempt at the kata given at http://codekata.com/kata/kata02-karate-chop/.

Day 1 is an exploration of the JUnit testing (using both theories and paramaterised tests). 
The solution is the obvious recursive approach.

Day 2 I refactored the JUnit tests to use inherritence to save rewritting all the tests I wrote yesterday. 
The solution is the obvious iterative approach.

Day1 Errors Log:
When selecting the sublist to the right of the midpoint to continue my search, I forgot to track the midpoint value and add these midpoints to the result of the final chop. 

eg/ chop(12, [1,11,12]) returned 0 because after the first recurse we now perform chop(12, [12]) returning 0, but we should add on the position of the initial chop to get 2


Day 2 Errors Log:
I breifly rewrote the solution using a case statement switching on the value of the midpoint compareTo target value. 
This caused me to get a sign error because the logic became obscured and less readable. (I reverted this change)
