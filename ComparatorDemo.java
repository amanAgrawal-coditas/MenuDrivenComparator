package Week_6.ComparatorMenuDriven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    int rno;
    String name, city;

    public Student(int rno, String name, String city)
    {
        this.rno = rno;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString()
    {
        return "Student" +
                "{" +
                "rno=" + rno +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

class SortByRoll implements Comparator<Student>
 {

    @Override
    public int compare(Student o1, Student o2)
    {
        return o1.rno - o2.rno;
    }
}

class SortByCity implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.city.compareTo(o2.city);
    }
}

class SortByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2)
    {
        return o1.name.compareTo(o2.name);
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(5, "E", "Pune"));
        list.add(new Student(6, "A", "Varanasi"));
        list.add(new Student(1, "F", "Mumbai"));
        list.add(new Student(2, "B", "Kanpur"));
        list.add(new Student(3, "C", "Bangalore"));
        list.add(new Student(4, "D", "Sangli"));


        boolean loop = true;
        while (true) {
            System.out.println("Enter 1 for regular display");
            System.out.println("Enter 2 for sortByRoll display");
            System.out.println("Enter 3 for sortByCity display");
            System.out.println("Enter 4 for sortByName display");
            System.out.println("Enter 5 to exit");
            int choice;
            Scanner sc=new Scanner(System.in);
            choice=sc.nextInt();
             switch (choice)
             {
                 case 1:
                 {
                     for (int i = 0; i < list.size(); i++) {
                         System.out.println(list.get(i));
                     }
                     break;
                 }
                 case 2:
                 {
                     Collections.sort(list, new SortByRoll());
                     for (int i = 0; i < list.size(); i++)
                     {
                         System.out.println(list.get(i));
                     }
                     break;
                 }
                 case 3:
                 {
                     Collections.sort(list, new SortByCity());
                     for (int i = 0; i < list.size(); i++)
                     {
                         System.out.println(list.get(i));
                     }
                     break;
                 }
                 case 4:
                 {
                     Collections.sort(list, new SortByName());
                     for (int i = 0; i < list.size(); i++) {
                         System.out.println(list.get(i));
                     }
                     break;
                 }
                 case 5:
                 {
                     System.exit(0);
                     break;
                 }
                 default:
                 {
                     System.out.println("Enter valid number");
                     break;
                 }
             }
        }

    }
}