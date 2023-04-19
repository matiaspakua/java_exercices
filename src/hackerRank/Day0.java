package hackerRank;

import java.util.Scanner;

public class Day0{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String userInput = scan.nextLine();

        scan.close();

        String generalMessage = "Hello World!";

        System.out.println(userInput + " " + generalMessage);
    }

}