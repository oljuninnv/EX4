import org.example.StringOperator;
import org.example.StringOperator;
import org.example.RandomStringGenerator;

import org.junit.Test;

public class CompareToTester {
    @Test
    public void testCompareTo() {
        for (int i = 0; i < 1000; i++){
            String s1 = RandomStringGenerator.generate(20, true, true);
            String s2 = RandomStringGenerator.generate(20, true, true);;
            int actual = StringOperator.compare(s1, s2);
            int expected = s1.compareTo(s2);
            if (actual == expected){
                System.out.println("---------test "  + (i + 1) + " is successful");
            }
            else{
                System.out.println("---------test " + (i + 1) + " is invalid");
            }
        }
    }
}
