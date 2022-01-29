public class Student {
    int age;
    String name,gender;
    static String clgnm="City College";

    Student(String n,String gn,int ag ){

  name=n;
  gender=gn;
  age=ag;

    }
    void info(){
        System.out.println("Name:"+name);
        System.out.println("Gender:"+gender);
        System.out.println("Age:"+age);
        System.out.println("College name:"+clgnm);
        System.out.println("\n");
    }
}
