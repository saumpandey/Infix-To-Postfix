package main;

import Infix_to_Postfix.InfixToPostfix;

public class MyMain {
    public static void main(String[] args) {
        InfixToPostfix converter = new InfixToPostfix();
        String infix = "A+B*(C+D)";
        String postfix = converter.infixPostfix(infix);
        System.out.println("postfix => " + postfix);
    }
}
