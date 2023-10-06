package demo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class testcase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        students student;
        ArrayList<students>listSV=new ArrayList<>();
        int choose=0;
        int n;
        do {
            System.out.println();
            System.out.println("-----------------CHUONG TRINH CHINH-----------------");
            System.out.println();
            System.out.println("------------------------MENU------------------------");
            System.out.println();
            System.out.println("1.	Nhập vào danh sách n sinh viên.\n"
                    + "2.	Xuất toàn bộ danh sách.\n"
                    + "3.	Xóa sinh viên.\n"
                    + "4.	Tìm kiếm sinh viên.\n"
                    + "5.	Sửa sinh viên.\n"
                    + "6.   Xóa tất cả.\n"
                    + "7.   Dem so luong sinh viên.\n"
                    + "8.	Thoát.\n");
            System.out.println("Nhập lựa chọn của bạn : ");
            choose=Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1 :
                    System.out.print("Nhập số lượng sinh viên : ");
                    n=Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập thông tin sinh viên thứ "+(i+1)+ ": ");
                        student=new students();
                        student.inPut();
                        listSV.add(student);
                    }
                    break;
                case 2 :
                    System.out.println("In danh sach");
                    for (students student2 : listSV) {
                        student2.outPut();
                    }
                    break;
                case 3 :
                    System.out.println("Nhap id sinh vien can xoa : ");
                    String idSV=sc.nextLine();
                    listSV.removeIf(ds-> ds.getId().equals(idSV));
                    System.out.println("Danh sách sau khi xóa");
                    for (students student1 : listSV) {
                        student1.outPut();
                    }
                    break;
                case 4 :
                    System.out.println("Nhap id sinh vien can tim kiem : ");
                    String idSv=sc.nextLine();
                    for (students student1 : listSV) {
                        if (student1.getId().equals(idSv)){
                            student1.outPut();
                        }
                    }
                    break;
                case  5:
                    System.out.println("Nhap id sinh vien can sua : ");
                    String idEdit = sc.nextLine();
                    for(students studentsEdit : listSV){
                        if (studentsEdit.getId().equals(idEdit)){
                            System.out.println("Thong tin sinh vien can sua");
                            studentsEdit.outPut();

                            String id,name;
                            int age,point;
                            Date year;
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
                                    studentsEdit.setYear(year);
                                }catch (Exception e){
                                    System.out.println(e.getMessage());
                                }
                            }
                            System.out.println("Enter point: ");
                            point=sc.nextInt();
                            studentsEdit.setId(id);
                            studentsEdit.setAge(age);
                            studentsEdit.setName(name);
                            studentsEdit.setPoint(point);
                        }
                    }
                    System.out.println("Danh sach sau khi sua");
                    for(students students:listSV){
                        students.outPut();
                    }
                    break;
                case 6 :
                    System.out.println("Xoa toan bo danh sach");
                    listSV.removeAll(listSV);
                    System.out.println("Xoa thanh cong ! Danh sach rong");
                    break;
                case  7 :
                    System.out.println("So luong sinh vien trong danh sach: "+listSV.size());
                    // dung fore
                    int count=0;
                    for(students students:listSV){
                        count++;
                    }
                    System.out.println("So luong sinh vien co trong danh sach : "+count);

                    break;
                case 8 :
                    System.out.println("ban da thoat khoi chuong trinh");
                    break;
            }
        }while (choose!=8);
    }
}
