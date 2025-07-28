// example showing the concept of wrapper class

public class WrapperDemo6 {
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println("uppercase : "+Character.isUpperCase(ch));
        System.out.println("lowercase : "+Character.isLowerCase(ch));
        System.out.println("alphabetic : "+Character.isAlphabetic(ch));
        System.out.println("digit : "+Character.isDigit(ch));
        System.out.println("space : "+Character.isSpace(ch));
        System.out.println("whitespace : "+Character.isWhitespace(ch));
    }
}