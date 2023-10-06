package demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class students {
    private  String id,name;
    private int age,point;
    private Date year;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public students(String id, String name, int age, int point, Date year) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.point = point;
        this.year = year;
    }

    public students() {
    }

    public void inPut(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id: ");
        id=sc.nextLine();
        System.out.println("Enter name: ");
        name=sc.nextLine();
        System.out.println("Enter age: ");
        age=Integer.parseInt(sc.nextLine());
        boolean check=false;
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        while (check!=true){
            try {
                System.out.println("Enter year: ");
                year=dateFormat.parse(sc.nextLine());
                check=true;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Enter point: ");
        point=sc.nextInt();
    }
    public  void outPut(){
        System.out.println("******************Thong tin sinh vien*******************");
        System.out.println("id : "+id);
        System.out.println("name : "+name);
        System.out.println("age : "+age);
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("year : "+dateFormat.format(point));
        System.out.println("point : "+point);

    }
}
