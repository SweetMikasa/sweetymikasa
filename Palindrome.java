import java.lang.*;
 
@SuppressWarnings("unused")
public class Palindrome {
    public static void main(String[] args) {
        for(int i = 0; i < 1000000; i++) {
            if(isPalindrom(i)) {
                System.out.println(i);
            }
        }
    }
    
 public static boolean isPalindrom(int num) {
        String StrOldNum  = Integer.toString(num);
        String newNum = "";
        for (int j = StrOldNum.length() - 1; j >= 0; j--) {
            newNum += StrOldNum.charAt(j);
        }
        if(StrOldNum.equals(newNum))
            return true;
        return false;
    }
}