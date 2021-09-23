/*
Peter wants to generate some prime numbers for his crypto-system.
Help him! Your task is to generate all prime numbers between two given numbers!

Input
The input begins with the number t of test cases in a single line (t<=10).
In each of the next t lines there are two numbers m and n (1 <= m <= n <= 1000000000, n-m<=100000) separated by a space.

Output
For every test case print all prime numbers p such that m <= p <= n, one number per line, test cases separated by an empty line.
Example
Input:
2
1 10
3 5

Output:
2
3
5
7

3
5
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

class PrimeGenerator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("TEST CASES");
        short t = Short.parseShort(br.readLine()); //test case
//        if (t < 0 || t > 10)
//            System.exit(1); //overflow
        for (int i = 1; i <= t; i++) {
            long m = 0, n = 0;
            String st = br.readLine();
            st = st.trim();
            short j = 0;
            while (Character.isDigit(st.charAt(j))) {
                m =m*10+ Integer.parseInt(String.valueOf(st.charAt(j)));
                j++;
            }
            while (j<st.length() ) {
                if (Character.isDigit(st.charAt(j)))
                n=n*10+ Integer.parseInt(String.valueOf(st.charAt(j)));
                j++;
            }
//            if(n > 1000000000 || m < 1 || m > 1000000000 ||  m<1 || (n-m)>100000 || m>n)
//                System.exit(0);
            long y=m;
            if(m==1)
                y+=1;
            for(; y<=n;y++) {
               boolean c=true;


                for(long a=2;a<=((long)Math.sqrt(y));a++) {
                    if(y%a==0) {
                        c=false;
                        break;
                    }
                }
                if(c)
                    System.out.println(y);
            }
            System.out.println("");
        }

    }
}
