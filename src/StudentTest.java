import java.util.Scanner;
public class StudentTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Put a name for the student: ");
		String firstname = input.next();
		System.out.println("Put a surname for the student: ");
		String lastname = input.next();
		System.out.println("Put a course title for the student: ");
		String course = input.next();
		System.out.println("Put a subject title for the student: ");
		String subject = input.next();
		System.out.println("Put an university for the student: ");
		String university = input.next();
		System.out.println("Put an email for the student: ");
		String email = input.next();
		System.out.println("Put a phone number for the student: ");
		String phone_num = input.next();
		
		Student student_1 = new Student(firstname, lastname, course, subject, university, email, phone_num);
		Student.displayInformation(student_1);
		Student.toString(student_1);
		
		Student st_2 = new Student();
		Student.displayInformation(st_2);
		Student.toString(st_2);
		
		Student st_3 = new Student("Alba", "Merdani", "person@example.com", "069 xx xx xxx");
		Student.displayInformation(st_3);
		Student.toString(st_3);
		
		Student st_4 = new Student(course, subject, university);
		Student.displayInformation(st_4);
		Student.toString(st_4);
		
		System.out.printf("\n\nYou have created %d student objects.", Student.nrOfObjects);
		
		input.close();
	}

}
