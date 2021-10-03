import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reverse = (new StringBuffer(A)).reverse().toString();
       System.out.println(reverse); // add this line otherwise it'll not show the reverse order
        if (A.equals(reverse)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
