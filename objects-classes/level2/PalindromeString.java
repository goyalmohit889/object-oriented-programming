import java.util.*;

//  Program to Check Palindrome String

public class PalindromeString {
    String str;
    String ss;
    public static String palindromeChecker (String str) {
        String s="";
        for(int i=str.length()-1;i>=0;i--){
            s+=str.charAt(i);
        }
        return s;
    }
    void display(){
        if (str.equals(ss)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
    public static void main(String[] args) {
        PalindromeString p = new PalindromeString();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String sss=p.str = sc.nextLine();
        p.ss=palindromeChecker(sss);
        p.display();
    }
}
