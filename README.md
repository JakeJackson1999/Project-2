# Project-2
MesoAbstract:
For this class I started by declaring a protected variable StID so that I could use it in both this class and MesoInherit. I 
then created a public MesoAbstract method that called a variable from the MesoStation class. Using that variable, I set the
getStID method from the MesoStation class to the protected StID variable in this class. Finally, i initialized an array of int 
type to later fill with the average, trunkated average, and ceiling average. I did all of this in this class in order to be 
able to use these variables in MesoInherit.

MesoInherit:
I started by creating a public MesoInherit method with a super called inside of it. This was necessary to be able to use the 
variables created in the MesoAbstract method. I then created the calAverage method with the return type of an int array. This 
was so that the Main class could call the specific information that would be stored in said array. First, I created a char 
array that was initialized to StID.toCharArray(). This allowed for each char in the StID string to be broken down and each 
char would be stored in different indexes. I then set each index to different char variables in order to store them outside of 
the array. After doing that, I casted each variable to (int) in order to get the ASCII value of each char and set those to 
new variables of type int. Now that these variables were changed to type int, I was able to then take the average of all of 
the characters. I did that by adding the values of all of the chars and dividing the sum by the number of chars. By doing that 
I had the average and then created two new variables to store the ceiling and floor of the average. I then put each variable 
into the corresponding array index. I then returned the array. I then created the letterAverage method which would return type 
char, the purpose of this method was to take the found average and return the corresponding char based off of the int value.
I set the average to a variable which was then cast to type (char). This gave the equivalent char from the int variable. I 
then returned the char which concluded MesoInherit.
