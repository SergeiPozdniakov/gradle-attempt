package com.example;
import org.apache.commons.lang3.StringUtils;

public class App {
    public String getGreeting() {
        return "Hello, World!";
    }

    public static void main(String[] args) {
        String text = "Hello, World!";
        String reversed = StringUtils.reverse(text);
        System.out.println("Original: " + text);
        System.out.println("Reversed: " + reversed);
    }
}