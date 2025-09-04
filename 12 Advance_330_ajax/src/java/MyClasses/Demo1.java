package MyClasses;

import com.google.gson.Gson;

class Student{
    int sid;
    String name,email;

    public Student(int sid, String name, String email) {
        this.sid = sid;
        this.name = name;
        this.email = email;
    }

    public Student() {
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Student obj = new Student(100,"Andrew Anderson","andrew@gmail.com");
        Gson g = new Gson();
        String jsonData = g.toJson(obj);
        System.out.println("Json Data : "+jsonData);
        
        Student s = g.fromJson(jsonData, Student.class);
        System.out.println("StudentId : "+s.getSid());
        System.out.println("StudentName : "+s.getName());
        System.out.println("StudentEmail : "+s.getEmail());
        
    }
}
