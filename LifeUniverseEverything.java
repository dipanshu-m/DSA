/*
Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything.
More precisely... rewrite small numbers from input to output.
Stop processing input after reading in the number 42.
All numbers at input are integers of one or two digits.

Example
Input:
1
2
88
42
99

Output:
1
2
88
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

public class LifeUniverseEverything {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long a; //take the longest number possible
        while(true){
            a=Long.parseLong(br.readLine()); //input number
            if(a!=42) //if number isn't 42
                System.out.println(a); //print
            else
                break;
        }
    }
}
