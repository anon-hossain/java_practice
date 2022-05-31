package Exercise1;

import java.util.Scanner;

class customer{

    String name, address, phone;
    int age;

    Scanner get = new Scanner(System.in);


    customer(String name2, String address2, String phone2, int age2) {
        name = name2;
        address = address2;
        phone = phone2;
        age = age2;
    }

    void get_customer_info(){
        System.out.println("Enter name: ");
        name = get.nextLine();
        System.out.println("Enter address: ");
        address = get.nextLine();
        System.out.println("Enter phone number: ");
        phone = get.nextLine();
        System.out.println("Enter age: ");
        age = get.nextInt();
    }

    void print_customer_info(){
        System.out.println("NAME : "+name);
        System.out.println("ADDRESS : "+address);
        System.out.println("AGE: "+age);
        System.out.println("PHONE: "+phone);
    }
}