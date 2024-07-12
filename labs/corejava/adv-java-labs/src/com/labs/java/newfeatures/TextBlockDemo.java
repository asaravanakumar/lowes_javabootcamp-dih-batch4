package com.labs.java.newfeatures;

public class TextBlockDemo {
    public static void main(String[] args) {
        String accountJson = "{\n" +
                "  \"id\":100,\n" +
                "  \"type\":\"Savings\"\n" +
                "  \"balance\":50000.0\n" +
                "}";

        System.out.println(accountJson);

        // Text Block
       String accountJsonTextBlock = """ 
                 {
                 "id":100,
                 "type":"Savings"
                 "balance":50000.0
               } """;

        System.out.println(accountJsonTextBlock);
    }
}
