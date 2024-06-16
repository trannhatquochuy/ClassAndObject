package advance.dev;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student[] students = new Student[10]; // Mảng chứa 10 sinh viên
	        
	        input(students); // Nhập thông tin cho mảng sinh viên
	        print(students); // In ra thông tin của mảng sinh viên
	    }

	    // Phương thức nhập thông tin cho mảng sinh viên
	    public static void input(Student[] students) {
	        Scanner scanner = new Scanner(System.in);

	        for (int i = 0; i < students.length; i++) {
	            System.out.println("Enter information for student " + (i + 1) + ":");
	            System.out.print("Name: ");
	            String name = scanner.nextLine();
	            System.out.print("Age: ");
	            int age = scanner.nextInt();
	            scanner.nextLine(); // Đọc dòng trống sau khi đọc số nguyên
	            System.out.print("Address: ");
	            String address = scanner.nextLine();
	            System.out.print("Phone number: ");
	            String phoneNumber = scanner.nextLine();
	            System.out.print("Average score: ");
	            double averageScore = scanner.nextDouble();
	            scanner.nextLine(); // Đọc dòng trống sau khi đọc số thực

	            students[i] = new Student(name, age, address, phoneNumber, averageScore);
	        }

	        scanner.close(); // Đóng scanner sau khi sử dụng xong
	    }

	    // Phương thức in ra thông tin của mảng sinh viên
	    public static void print(Student[] students) {
	        System.out.println("List of students:");
	        for (int i = 0; i < students.length; i++) {
	            System.out.println("Student " + (i + 1) + ":");
	            System.out.println("Name: " + students[i].getName());
	            System.out.println("Age: " + students[i].getAge());
	            System.out.println("Address: " + students[i].getAddress());
	            System.out.println("Phone number: " + students[i].getPhoneNumber());
	            System.out.println("Average score: " + students[i].getAverageScore());
	            System.out.println(); // In dòng trống để phân tách thông tin của các sinh viên
	        }
	    }
	}
