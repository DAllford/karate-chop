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


Day 3 Errors Log:
This solution was the most challenging to code so far, requiring several rough sketches of arrays and several runs of the tests
to determine boundary conditions. 
The main difficulty was how to initialise the center and radius, as well as calculate the next radius and center. 
Things became more straight forward when I made a concrete decision that I would set up center to always be the furthest
right of the squares I could choose to be my mid point and the radius to be the distance from the center to the furthest
left we had not yet ruled out. 
These invariants were relatively easy to maintain.

I also ran into a problem when handling empty lists where I tried to access the 0th element. Easy to resolve and picked up in my tests.

Day 4 Errors Log:
This was really fun. I started by taking the day 3 solution and unfolding the recursion. I then replaced the while loop with a forEach loop, and replaced conditional addition by using compareTo. 

I added an element into the list so that I did not have to check if the list was empty when accessing it. I appended this element so that if it was accessed in the binary chop I knew that we had finished the algorithm unsuccessfully. 

I made an implict assumption that n+1>n which led to an out of bounds exception. I identified this fallacy and wrote a unit test (where the target we are searching for is Integer.MAX_VALUE) and made it pass by moving when I added into the list. The bug was quite subtle, and resulted from implementation specific details. Fixed in a174b5dae864be531c6d331a34fecd1e347b2ff4. 

This has been quite difficult today because it is not a natural way for me to write code. If I had not developer the radius solution yesterday I would have struggled even more becuase I could take the out by one errors I fixed yesterday and apply that directly here.

Note: I havent yet been saved by my parameterised or theory tests as once I have got the basic tests passing the rest 
have all gone through with no problem.
