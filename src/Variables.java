public class Variables {

    public static void main(String[] args) {

        //1Declare and initialize a variable of type int called age to a value of 33.
        //2Print out the variable age using a single println statement.
        //3Declare and initialize a variable of type double called balance to a value of 18.89.
        //4Declare and initialize a variable of type int called dollars. This variable should be equal to the value of casting the variable balance to an int. That is, if balance is equal to 18.89, dollars will therefore be equal to 18.
        //5Declare and initialize a variable of type int called dollarsRounded. This variable should be equal to the value of casting the variable balance to an int but will round balance to the nearest integer. That is, if balance is equal to 18.89, dollarsRounded will therefore be equal to 19.
        //6Declare and initialize a variable of type char called letter to a value of A.
        //7Print out the variable letter.
        //8Cast the variable letter to an integer and print it out. Do this in a single statement.
        //9Increment the variable letter using the postfix increment operator.
        //10Print out the variable letter.
        //11Cast the variable letter to an integer and print it out. Do this in a single statement.
        //12Explain what is happening in questions 6 - 11. Focus your explanation on character data types and integers.

        /**
         * [type answer here]
         */
        //1
        int age = 33;
        //2
        System.out.println(age);
        //3
        double balance = 18.89;
        //4
        int dollars = (int)balance;
        //5
        int dollarsRounded = (int)(balance+0.5);
        //6
        char letter = 'A';
        //7
        System.out.println(letter);
        //8
        System.out.println((int)letter);
        //9
        letter++;
        //10
        System.out.println(letter);
        //11
        System.out.println((int)letter);

        /* In question 6, the character "letter" is declared and intialised as the letter 'A'. Question 7 and 8 prints out the value of variable "letter" -- "A".
        In question 8, the char variable "letter" is cast to an integer, and it's integer equivalent is printed. Each individual character, in java, is associated with
        a corresponding integer value. In the case of the character "A", it's corresponding value is printed as 65. Question nine increments the character "A", by one
        to the character "B". The value of the variable "letter" is, then, changed from "A" to "B". Question 10 and 11 print out the new, incremented value of "letter", "B", and it's
        new integer equivalent, 66.
         */




    }
}
