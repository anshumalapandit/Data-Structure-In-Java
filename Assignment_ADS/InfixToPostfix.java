package ADS;


import java.util.*;

public class Assign2{

    // Function to check if the character is an operand (letter or digit)
    public static boolean isOperand(char ch) {
        return Character.isLetterOrDigit(ch);
    }

    // Function to return the precedence of operators
    public static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    // Function to convert infix expression to postfix
    public static String postfix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder(); // here i am storing my answer.

        System.out.println("Step-by-step process:"); // imp line

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            // curr = 1. operand 2. ( 3. ) 4 . opeartor

            // 1.If the character is an operand, append it to the result
            if (isOperand(curr)) {
                result.append(curr);
                System.out.println("Operand: " + curr); // print operand
                System.out.println("Postfix: " + result); // i will print result in each step
                System.out.println("Stack: " + st); // i will print content of stack in every step
            }
            // 2.If the character is an opening parenthesis, push it to the stack
            else if (curr == '(') {
                st.push(curr);
                System.out.println("Pushed '(': Stack = " + st); // ek hi kaam hua wahi display kro bas
            }
            //3. If the character is a closing parenthesis, pop from stack to result until '(' is found
            else if (curr == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    result.append(st.pop());
                }
                st.pop(); // Pop '('
                System.out.println("Popped until '(': Postfix = " + result); // pop ka kaam hua to wahi display kro
                System.out.println("Stack: " + st);
            }
            // 4.If the character is an operator
            else {
                while (!st.isEmpty() && precedence(curr) <= precedence(st.peek())) {
                    result.append(st.pop());
                }
                st.push(curr);
                System.out.println("Operator: " + curr); // operator ko push kiya hai to wo display kro
                System.out.println("Postfix: " + result);
                System.out.println("Stack: " + st);
            }
        }

        // Pop all remaining operators from the stack
        while (!st.isEmpty()) {
            result.append(st.pop());
        }
        System.out.println("Final Postfix Expression: " + result);
        return result.toString();
    }

    public static void main(String[] args) {
        // Taking the infix expression input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Infix: ");
        String s = sc.nextLine(); // Example: "a-b*c-d/e+f"

        System.out.println("Infix Expression: " + s);
        System.out.println("Converting to Postfix...");
        System.out.println();

        // Calling the postfix function and printing the result
        String postfixExpression = postfix(s);
        System.out.println("Postfix Expression: " + postfixExpression);
    }
}


