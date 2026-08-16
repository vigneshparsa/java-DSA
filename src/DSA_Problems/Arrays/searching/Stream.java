package DSA_Problems.searching;
import java.lang.String;

// Removing a specific character from string
// Without return type

public class Stream {
    public static void main(String[] args) {
        Skip("" ,"$ parisa $");
        System.out.println(Skip("$ parisa $"));
        System.out.println(SkipApple("Apple is very tasty."));
        System.out.println(SkipAppNotApple("App is very tasty."));
    }
    static void Skip(String p , String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'r') {
            Skip(p, up.substring(1));
        } else {
            Skip(p + ch, up.substring(1));
        }
    }

//     With a return type

    static String Skip(String str2) {
        if (str2.isEmpty()) {
            return " ";
        }
        char ch = str2.charAt(0);
        if(ch =='r'){
            return Skip(str2.substring(1));
        }
        else{
            return ch + Skip(str2.substring(1));
        }
    }

    //Returning entire string not a character

    static String SkipApple(String s1){
        if(s1.isEmpty()){
            return " ";
        }
        if(s1.startsWith("Apple")){
            return SkipApple(s1.substring("Apple".length()));
        }
        else{
           return s1.charAt(0) + SkipApple(s1.substring(1));
        }
    }

    static String SkipAppNotApple(String s2){
        if(s2.isEmpty()){
            return " ";
        }
        if(s2.startsWith("App") && !s2.startsWith("Apple")){
            return SkipAppNotApple(s2.substring(3));
        }
        else{
            return s2.charAt(0) + SkipAppNotApple(s2.substring(1));
        }
    }
}

