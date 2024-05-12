package org.example;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

/*Класс для генерации случайных строк
@param length int - длина строки
@param OnlyLetters boolean - должна ли строка содержать только буквы
@param Digits boolean - должна ли строка содержать буквы и цифры
@return String - сгенерированная строка
*/
public class RandomStringGenerator {
    public static String generate(int length, boolean OnlyLetters, boolean Digits) {
        if (!OnlyLetters && !Digits){
            return "Один из параметров должен быть true";
        }
        char[] characters = OnlyLetters ? "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray()
                : "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        List<Character> charListToGenerate = new ArrayList<>();
        for (char character: characters) {
            charListToGenerate.add(character);
        }

        StringBuilder result = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++){
            int index = random.nextInt(charListToGenerate.size());
            result.append(charListToGenerate.get(index));
        }
        return result.toString();
    }
}