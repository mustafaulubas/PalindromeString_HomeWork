package com.homework;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please write a word: ");
        String word = new Scanner(System.in).next();
        StringBuilder reverse = new StringBuilder(word);

        if (word.equalsIgnoreCase(reverse.reverse().toString())){
            System.out.println(word + " is a palindrome word.");
        }else{
            System.out.println(word + " is not a palindrome word.");
        }


    }
}
