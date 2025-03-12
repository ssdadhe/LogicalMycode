import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class StringPrograms {
    public static void main(String[] args) {
        reverseString();
        reverseStringStringBuffer();
        stringToChar();
        swapTwoStrings();
        compareTwoStrings();
        camelCaseEachLetter();
        compressString();
        countDuplicateWords();
        revereseLargestWord();
        printAlphabets();
        anagram();
        reverseEachWord();
        toReverseEvenWordInString();
        splitAndReverse();
        repeatedCharactersInString();

    }

    // Program to reverse the string
    public static void reverseString() {
        String s = "SDET ENGINEER";

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }

    //Program to reverse the string using string buffer
    public static void reverseStringStringBuffer() {

        String str = "Shlok Sachin Dadhe";

        StringBuffer sb = new StringBuffer(str);
        StringBuffer str1 = sb.reverse();

        // print original string
        System.out.println(str);
        // reverse order string
        System.out.println(str1);
    }

    //Program to convert string to character
    public static void stringToChar() {
        String str = "Sagar";
        for (int i = 0; i <= str.length() - 1; i++) {
            System.out.println(str.charAt(i));
        }
    }

    //Program to swap two strings
    public static void swapTwoStrings() {
        String s1 = "Shourya";
        String s2 = "Shivansh";
        String s3 = "";
        s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println(s1);
        System.out.println(s2);
    }

    //Program to compare two strings
    public static void compareTwoStrings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1 = scanner.nextLine();
        System.out.println("Enter second string:");
        String s2 = scanner.nextLine();

        if (s1.compareTo(s2) == 0) {
            System.out.println("Two strings are equal");
        } else {
            System.out.println("Two strings are not equal");
        }
    }

    //Program to camel case each letter
    public static void camelCaseEachLetter() {
        String s1 = "i am software test engineer";
        String[] s2 = s1.split(" ");
        StringBuffer sb = new StringBuffer();
        for (String word : s2) {
            sb.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }

        String finalStr = sb.toString().trim();
        System.out.println(finalStr);

    }

    //Program to compress the string
    public static void compressString() {
        String s = "abbbcccdddeefffghhiiiijjjj";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : map.keySet()) {
            stringBuilder.append(ch).append(map.get(ch));
        }
        System.out.println(stringBuilder.toString());
    }

    //Program to count the duplicate words
    public static void countDuplicateWords() {
        String s1 = "My My name name is is sagar sagar dadhe";
        String[] s2 = s1.split(" ");
        int counter = 0;
        for (int i = 0; i < s2.length; i++) {
            for (int j = i + 1; i < s2.length; i++) {
                if (s2[i].equals(s2[j])) {
                    System.out.println(s2[i] + " ");
                    counter++;
                }
            }
        }
        System.out.println();
        System.out.println(counter);
    }

    //Program to reverse the largest word

    public static void revereseLargestWord() {
        String s1 = "I am Trader Engineer and Tester";
        String[] s2 = s1.split(" ");
        String largeWord = " ";

        for (String word : s2) {
            if (word.length() > largeWord.length()) {
                largeWord = word;
            }
        }
        System.out.println("Largestword is " + largeWord);

        StringBuffer sb = new StringBuffer(largeWord);
        StringBuffer reverseWord = sb.reverse();
        String wordR = reverseWord.toString();

        System.out.println(wordR);
    }

    // Program to print alphabet A to Z
    public static void printAlphabets() {


        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
    }

    //Separate Char,No.,Special
    public static void seperateNoCharSp() {
        String s = "Sachi9*&^%#$%^%^&60n89874#@@$^***&^^$$#97876";

        String no = " ";
        String ch = " ";
        String special = " ";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                no = no + s.charAt(i);
            } else if (Character.isAlphabetic(s.charAt(i))) {
                ch = ch + s.charAt(i);
            } else {
                special = special + s.charAt(i);
            }
        }
        System.out.println(no);
        System.out.println(ch);
        System.out.println(special);
    }

    //Upper_Lower case separation
    public static void upperLowerCaseSeperation()	{
        String s="SaChInDaDhE";
        String lower=" ";
        String upper=" ";
        for (int i = 0; i <=s.length()-1; i++)
        {if (Character.isUpperCase(s.charAt(i)))
        {upper=upper+s.charAt(i);
        }
        else {lower=lower+s.charAt(i);
        }
        System.out.println(upper);
        System.out.println(lower);
        }
    }

    //Check programs are Anagrams
    public static void anagram(){
        String s1="Race";
        String s2="Care";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length()==s2.length()){

            char[] charArray1=s1.toCharArray();
            char[] charArray2=s2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            boolean result=Arrays.equals(charArray1,charArray2);

            if (result){
                System.out.println("Strings are anagram");
            }
            else {
                System.out.println("String are not anagram");
            }
        }

    }
    //Program for reverse each word of string
    public static void reverseEachWord(){
        String s1 = "Sagar Sugriv Dadhe";
        String[] subString = s1.split(" ");
        for (int i = 0; i < subString.length; i++) {
            String oriString = subString[i];
            String revString = "";
            for (int j = oriString.length() - 1; j >= 0; j--) {
                revString = revString + oriString.charAt(j);
            }
            System.out.print(revString + " ");
        }
    }
    //Program to reverse even word in the string
    public static void toReverseEvenWordInString() {
        String s1 = "Sagar Sugriv Dadhe";
        System.out.println();
        String[] subString = s1.split(" ");
        for (int i = 0; i < subString.length; i++) {
            if (i % 2 == 1) {
                String oriString = subString[i];
                String revString = "";
                for (int j = oriString.length() - 1; j >= 0; j--) {
                    revString = revString + oriString.charAt(j);
                }
                System.out.print(revString + "  ");
            } else {
                System.out.print(subString[i] + " ");
            }
        }
    }
    //Program to find the repeated characters in the string
    public static void repeatedCharactersInString() {
        String s="sacsachihinn";
        int counter=0;
        for (int i=0; i<s.length(); i++){
            for (int j=i+1; j<s.length(); j++){
                if (s.charAt(i)==s.charAt(j)){
                    counter++;
                    System.out.print(s.charAt(i) + " ");
                }
            }
        }
        System.out.println();
        System.out.println(counter);
    }

    //Split and reverse the string

        public static void splitAndReverse() {
            String s1="Sachin Dadhe";

            String [] s2=s1.split(" ");
            for (int i=s2.length-1;i>=0;i--){
                System.out.print(s2[i] + " ");
            }
        }


    }
















