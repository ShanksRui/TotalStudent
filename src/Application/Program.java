package Application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import Entities.Student;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		Set<Student> set = new HashSet<>();
		
		System.out.print("How many students for course A");
		int n = sc.nextInt();
		for(int i = 0; i < n;i++) {		
			int identity = sc.nextInt();
		    set.add(new Student(identity));
		}
		System.out.print("How many students for course B ");
		n = sc.nextInt();
		for(int i = 0; i < n;i++) {
			int identity = sc.nextInt();
			set.add(new Student(identity));
		}
		System.out.print("how many students for course C");
		n = sc.nextInt();
		for(int i = 0; i <n;i++) {
			int identity = sc.nextInt();
			set.add(new Student(identity));
		}
		System.out.println("total students:"+ set.size());
		sc.close();
	}
}
