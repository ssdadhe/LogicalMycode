import java.util.Scanner;

public class PatternProgram {
    public static void main(String[] args) {

        numberPattern1();
        numberPattern2();
        starEqualToRows();
        starPattern1();
        starPattern2();

    }

    public static void numberPattern1(){
        int row=5;
        for (int i=1; i<=row; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }
   /* output:
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5*/

    //Number Pattern2

    public static void numberPattern2(){
        int row=5;
        for (int i=1; i<=row; i++){
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");

            }
            System.out.println();
        }
    }
    /*output:
    1
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5*/

    //Print star equal to rows
    public static void starEqualToRows(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter row number");
        int rows=s.nextInt();

        for (int i=1;i<=rows;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
/*Output:
            *
            **
            ***
            ****
            ***** */

    //Star pattern 1 program
    public static void starPattern1(){
        for (int i=1; i<=4; i++){
            for (int j=1; j<=i; j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
    /*  Output:
            *
            *  *
            *  *  *
            *  *  *  *
            *  *  *  *  *     */


    //Star pattern 2 program

    public static void starPattern2() {
        for (int i = 1; i <=4 ; i++)
        {
            for (int j = 4; j >=i ; j--)
            {
                System.out.print(" * ");

            }
            System.out.println();

        }
    }
   /* Output:
            *  *  *  *
            *  *  *
            *  *
            *         */



}
