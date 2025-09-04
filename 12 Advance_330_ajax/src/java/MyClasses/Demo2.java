package MyClasses;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Scanner;
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter No. of Students : ");
        int num = sc.nextInt();
        
        StudentNew obj[] = new StudentNew[num];
        System.out.println("Enter student details : ");
        for(int i=0;i<obj.length;i++){
            System.out.println((i+1)+" student details : ");
            obj[i] = new StudentNew();
            obj[i].getDetails();
        }
        
        ArrayList<StudentNew> list = new ArrayList<>();
        for(int i=0;i<obj.length;i++){
            list.add(obj[i]);
        }
        Gson g = new Gson();
        String jsonData = g.toJson(list);
        System.out.println("Json Data : "+jsonData);        
        // here json have array of object thats why StudentNew[].class
        StudentNew  data[]= g.fromJson(jsonData,StudentNew[].class); 
        for(int i=0;i<data.length;i++){
            System.out.println("\n"+(i+1)+" student details : ");
            System.out.println("Student Id = "+data[i].getSid());
            System.out.println("Student Name = "+data[i].getName());
            System.out.println("Student Email = "+data[i].getEmail());
        }
    }
}

