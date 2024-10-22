package Stack;
import java.util.*;

public class InfixPostfix {
//isOperand fxn
	public static boolean isOperand(char ch){
		return Character.isLetterOrDigit(ch);
	}
	//precedence
	public static int precedence(char ch) {
		
		switch(ch) {
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
	public static String postfix(String s) {
		Stack<Character>st=new Stack<>();
		StringBuilder result =new StringBuilder();
		for(int i=0;i<s.length();i++) {
			char curr=s.charAt(i);
			//if curr character is operand= letter/alpabet
			//before pushing in stack we have to check that is it operator/character then only put
			//if it is operand or letter then print it
			if(isOperand(curr)) {
				result.append(curr);
				//if u get opening bracket put into stack
				}else if(curr=='('){
					st.push(curr);
					//if u get clsoing brack then start poppping ele until u find opening bracket
				}else if(curr==')') {
					//stack empty till (
					if(!st.isEmpty() && st.peek()!='(') {
				         result.append(st.pop());
					}
					//last one 
					st.pop();
				}
				else 
					//if u get operator then check precedence
				{
					while(!st.isEmpty() && precedence(curr)<=precedence(st.peek())) {
						result.append(st.pop());
					}
					//push current operator
					st.push(curr);
				}
			}
		//pop remaining all
		while(!st.isEmpty()) {
			if(st.peek()=='(') {
				return "Invalid Expression";
			}
			//start popping 
			result.append(st.pop());
		}
		return result.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine(); //"a+b*(c^d-e)^(f+g*h)-i"
      System.out.println("Infix Expression is: "+s);
      System.out.println("Postfix Expression is: "+postfix(s));
    }

}
