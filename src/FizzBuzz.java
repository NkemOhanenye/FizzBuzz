/**
 * Created by Nkem Ohanenye on 1/11/17.
 */
public class FizzBuzz {
    public static void main(String args[]){
        for (int i=0;i<101;i++){ //had to use for loop to get in the numbers
            if (i%5==0){ //had trouble deciding but thought using if would be faster to find the numbers //mods of 5
                System.out.print("Fizz"); //print Fizz
            }
            if (i%7==0){ //gives the mods of 7
                System.out.print("Buzz"); //print Buzz
            }
            System.out.println(i); //print i //couldnt figure out how to print before FizzBuzz
        }
    }
}
