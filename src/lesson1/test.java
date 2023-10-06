package lesson1;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        boolean checkSNT=true;
//        System.out.println("Nhap so n can kiem tra SNT :");
//        int n=sc.nextInt();
//        if (n<=1){
//            checkSNT=false;
//        }else {
//            for(int i=2;i<= Math.sqrt(n);i++)
//            {
//                if(n%i==0)
//                {
//                    checkSNT=false;
//                    break;
//                }
//                checkSNT=true;
//            }
//        }
//
//        System.out.println(checkSNT);
//
//        System.out.println("in danh dách snt");
//        System.out.println("SNT nho hon v la :  ");
//        int v=sc.nextInt();
//
//        for (int i1 = 2; i1 <=v ; i1++) {
//            int count=0;
//            for (int j = 1; j <=i1 ; j++) {
//                if (i1%j==0){
//                    count++;
//                }
//            }
//            if (count==2){
//                System.out.print(i1+ " "+"\t");
//            }
//        }
//
//
//
//        System.out.println();
//        System.out.println("Nhap so can kiem tra co phai so chinh phuong hay khong ?");
//        int m=sc.nextInt();
//        boolean checkSCP=false;
//        for(int k=0;k<=m;k++){
//            if (k*k==m){
//                checkSCP=true;
//                break;
//            }
//            checkSCP=false;
//        }
//        System.out.println(checkSCP);


        System.out.println("Nhập số lượng phần tử mảng : ");
        int arr = sc.nextInt();
        System.out.println("Nhập mảng");
        int array[] = new int[arr];
        for (int i = 0; i < arr; i++) {
            System.out.println("Nhập phần tử thứ arr[" + i + "]" + ": ");
            array[i] = sc.nextInt();
        }
        //xuat
        System.out.println("Mảng vừa nhập");
        for (int i = 0; i < arr; i++) {
            System.out.print(array[i] + "\t");
        }
        // tim so lan xuat hien cua 1 so
//        System.out.println();
//        System.out.println("Nhap phan tu can dem : ");
//        int countNumber=sc.nextInt();
//        int dem=0;
//        for (int i = 0; i < arr; i++) {
//            if (array[i]==countNumber){
//                dem++;
//            }
//        }
//        System.out.print("so lan xuat hien cua "+countNumber+" la :  "+dem);
//        System.out.println();
//        //tinh tong
//        int sum=0;
//        for (int i = 0; i < arr; i++) {
//            sum+=array[i];
//        }
//        System.out.println("sum : "+sum);
//        // tinh tbc
//        System.out.println();
//        int tong=0;
//        for (int i = 0; i <arr ; i++) {
//            tong+=array[i];
//        }
//        double tbc = (double) tong / array.length;
//        System.out.println("tbc: "+tbc);
        System.out.println();
        // vị trí của số cần tìm trong mảng
        System.out.println("nhap so can tim vi tri : ");
        int vitri=sc.nextInt();
        for (int i = 0; i < arr; i++) {
            if (array[i]==vitri){
                System.out.println(vitri+" nam o vi tri thu " +i);
            }
        }
        // xu ly các đoạn code
//        System.out.println();
//        System.out.println("Sắp xếp");
//        for (int i = 0; i < arr; i++) {
//            for (int j = 0; j < i; j++) {
//                if (array[i] > array[j]) {
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//        System.out.print("in danh sach giam dan");
//        System.out.println();
//        for (int i = 0; i < arr; i++) {
//            System.out.print(array[i] + "\t");
//        }

    }
}

