// example showing the concept of wrapper class

import java.util.Scanner;
public class WrapperDemo9 {
    static String validateMobileNumber(String num){
            boolean status=true;
            if(num.length()!=10)
                status = false;
            else{
                if(num.charAt(0)>=54){     // compare with ascii value
                        for(int i=0;i<10;i++){
                        char ch = num.charAt(i);
                        if(!Character.isDigit(ch)){
                            status = false;
                            break;
                        }
                    }
                }else
                    status = false;    
            }
            String s =  status ? "Valid Mobile Number" : "Invalid Mobile Number";
            return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 digit mobile number : ");
        String number  = sc.next();
        System.out.println("Status : "+validateMobileNumber(number));
    }
}