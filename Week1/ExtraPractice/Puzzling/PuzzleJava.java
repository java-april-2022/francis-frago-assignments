import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    // To use methods from the Random library you need to create an instance of Random
    Random randGenerate = new Random();

    // getTenRolls 
    // Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive.
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> randArray = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            randArray.add(randGenerate.nextInt(20));
        }
        return randArray;
    }

    // getRandomLetter
    // 1. Create an array within the method that contains all 26 letters of the alphabet (this array must have 26 values). 
    // 2. Generate a random index between 0-25, and use it to pull a random letter out of the array. 
    // 3. Return the random letter
    public String getRandomLetter() {
        String alphaString = "abcdefghijklmnopqrstuvwxyz";
        String[] alphaList = new String[26];
        
        for (int i = 0; i < 26; i++) {
            alphaList[i] = String.valueOf(alphaString.charAt(i));
        }
        String randomLetter = alphaList[randGenerate.nextInt(26)];
        return randomLetter;
    }

    // generatePassword 
    // Write a method that uses the previous method to create a random string of eight characters,and return that string.
    public String generatePassword() {
        String password = "";
        
        for (int i = 1; i <= 8; i++) {
            password += getRandomLetter();
        }
        return password;
    }

    // getNewPasswordSet
    // Write a method that takes an int length as an argument and creates an array of random eight character words. 
    // The array should be the length passed in as an int.
    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> randPasswordArray = new ArrayList<String>();
        for (int i = 1; i <= length; i++) {
            randPasswordArray.add(generatePassword());
        }
        return randPasswordArray;
    }

}