import java.util.*;

public class ArrayPrograms {
    public static void main(String[] args) {

       smallestNumberInArray();
       duplicatesInArray();
       removeDuplicateStringFromArray();
       removeDuplicateNumberFromArray();
       seconLargestNumber();
       reverseArrayUsingCollections();
       seconLargestNumber();
       minimumNumberInArray();
       maxNumberIArray();


    }

    //Smallest number in the array
    public static void smallestNumberInArray(){
        int[] x={10,5,13,21,47,98,54,73,31,81,61,101,200};
        int min=x[0];
        for (int i=1; i<x.length; i++){
            if (x[i]<x[0]){
                min=x[i];
            }

        }
        System.out.println(min);
    }
    //Program to find duplicates in array
    public static void duplicatesInArray(){
        int[] x={10,20,30,25,29,41,11,10,20,25,57,57};
        for (int i=0; i<x.length; i++){
            for (int j=i+1; j<x.length; j++){
                if (x[i]==x[j]){
                    System.out.println(x[i]+" ");
                }
            }
        }
    }

    //Remove duplicate string from array
    public static void removeDuplicateStringFromArray(){
        String s1="Hello Hello everyone my my name  name is is SACHIN SACHIN";
        String [] words=s1.split(" ");
        HashSet<String> uniqueWords=new HashSet<>();
        for (String word: words){
            uniqueWords.add(word);
            }
        for (String result: uniqueWords){     //printing hashset using loop
            System.out.println(result+" ");
        }
        System.out.println();
        Iterator<String> iterator=uniqueWords.iterator();  //printing hashsetusing iterator
        while(iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }
    }
    //Program to remove duplicate numbers from array
    public static void removeDuplicateNumberFromArray(){
        int [] num={10,20,45,3,3,4,5,78,95,45,45,10,45,20};

            HashSet<Integer> uniqueElement=new HashSet<>();
            for (int element:num){         // adding element to hashset
                uniqueElement.add(element);
            }
            for (int number:uniqueElement){     // printing hashset
                System.out.print(number + " ");
            }
        }

    //Reverse array using collections
    public static void reverseArrayUsingCollections() {

        Character [] ch={'s','a','c','h','i','n'};
        List<Character> charList = Arrays.asList(ch);
        System.out.println(charList);

        System.out.println("Reversed char array is as below");
        Collections.reverse(charList);
        System.out.println(charList);
    }

//Find second largest number in array
public static void seconLargestNumber() {
    int [] x={5,3,8,3,13,9,18,51,1,0,};
    Arrays.sort(x);

    System.out.println(Arrays.toString(x));

    System.out.println("Largest number is " + x[x.length-1]);
    System.out.println("second largest number is " + x[x.length-2]);
    System.out.println("Smallest number is " + x[0]);
}
//Find the minimum number from a 2D array
    public static void minimumNumberInArray(){
        int[][] array = {{4, 5, 6}, {7, 3, 0}, {5, 2, 1}};
        int min = array[0][0];
        for (int[] row : array) {
            for (int num : row) {
                if (num < min) min = num;
            }
        }
        System.out.println("Minimum number: " + min);
    }

    //Find the maximum number from a 2D array
    public static void maxNumberIArray(){
        int[][] array = {{4, 5, 6}, {7, 3, 9}, {5, 2, 8}};
        int max = array[0][0];
        for (int[] row : array) {
            for (int num : row) {
                if (num > max) max = num;
            }
        }
        System.out.println("Maximum number: " + max);
    }


}
