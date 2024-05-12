package org.example;
import org.example.StringOperator;
import org.example.RandomStringGenerator;

public class Main {
    public static void main(String[] args) {

        int testCount = 1000;

        for (int i = 0; i < testCount; i++) {
            String s1 = RandomStringGenerator.generate(20, false, true);
            String s2 = RandomStringGenerator.generate(20, false, true);

            int result = StringOperator.compare(s1, s2);

            System.out.println("Test " + (i+1) + ": " + s1 + " vs " + s2 + " = " + result);
        }
    }


}