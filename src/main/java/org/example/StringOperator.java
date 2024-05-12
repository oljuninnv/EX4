package org.example;

/*Класс для сравнения строк
@param s1 String - строка1
@param s2 String - строка2
*/
public class StringOperator {
    public static int compare(String s1, String s2) {
        int n = Math.min(s1.length(), s2.length());
        // алгоритм лексикографического сравнения
        for (int i = 0; i < n; i++){
            if (s1.charAt(i) != s2.charAt(i)){
                return s1.charAt(i) - s2.charAt(i);
            }
        }
        if (s1.length() < s2.length()){
            return 1;
        }
        else if (s1.length() > s2.length()){
            return -1;
        }
        return 0;
    }
}