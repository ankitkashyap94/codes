package HrQuests;

import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String newStr = "He is a very very good boy, isn't he?";
        getTokens(newStr);

    }

    static void getTokens(String str){

        String[] tokens = str.split("[\\s.,!'?:]+");
        int tokensLen = tokens.length;
        for(String token : tokens){
            System.out.println(token);
        }


    }
}
