import java.util.*;

public class Reverse_String {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
        System.out.print("Enter a String:");
        String s=sc.nextLine();//Enter the string you want to reverse

        int l=s.length();//Storing the length of the string

        Stack<Character> a=new Stack<>();//Creating a stack named "a" 

       

        for(char ch:s.toCharArray()){//iterating through the string using forEach loop
            a.push(ch);//adding each character to the stack
        }

        s="";

        while(l-->0){
            s=s+a.pop();//as pop occurs from top therefore while popping a character we add it to a string which is stored in reverse order 
        }
        System.out.println("Output-"+s);
        
     

	}

}
