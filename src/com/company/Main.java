package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.String;
import java.lang.StringBuffer;
public class Main {

    public static void main(String[] args) {
        System.out.print("Enter string:");
        String s = new Scanner (System.in).nextLine();
       // StringBuffer s = new StringBuffer(System.in).nextLine();(буффер - недоработанный)
        s += " ";
        char[] chars = s.toCharArray();
        String[] words = s.split(" ");
        char List[] = {'а','е','ё','и','о','у','ы','э','ю','я'};


        String tmp1;
        String tmp2;
        String result="";
        int score = 0, scoreWords = -1;


        for (int i = 0; i <= s.length() - 1; i++) {
            tmp2 = String.valueOf(chars[i]);
            for (int j = 0; j <= 9; j++) {
                tmp1 = String.valueOf(List[j]);
                if (tmp2.equals(tmp1)){
                    score++;
                }
            }
            if (tmp2.charAt(0) == ' ') {
                scoreWords++;
                if(score == 1){
                    score = 0;
                    continue;
                }
                else
                {
                    score = 0;
                    result += words[scoreWords] + " ";
                }
            }
        } System.out.println("Output string:" + result);
    }
}