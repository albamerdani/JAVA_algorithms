public class Student {
	private String name;
	private String surname;
	private String course;
	private String subject;
	private String university;
	private String email;
	private String phone_number;
	
	static int nrOfObjects = 0;		//variabel qe mban numrin e objekteve Student te krijuar

	
	public Student(){		//konstruktor pa parametra
		this.name = getName();
		this.surname = getSurname();
		this.email = getEmail();
		this.phone_number = getPhone_number();
		this.course = getCourse();
		this.subject = getSubject();
		this.university = getUniversity();
		nrOfObjects++;
	}
	
	
	//konstruktor me te gjitha parametrat
	public Student(String name, String surname, String course, String subject, String university, String email, String phone_number){
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.phone_number = phone_number;
		this.course = course;
		this.subject = subject;
		this.university = university;
		nrOfObjects++;
	}
	
	
	//konstruktor me disa parametra
	
	public Student(String emri, String mbiemri, String email, String nr_tel){
		name = emri;
		surname = mbiemri;
		this.email = email;
		phone_number = nr_tel;
		this.course = getCourse();
		this.subject = getSubject();
		this.university = getUniversity();
		nrOfObjects++;
	}
	
	public Student(String kursi, String lenda, String universitet){
		this.name = getName();
		this.surname = getSurname();
		this.email = getEmail();
		this.phone_number = getPhone_number();
		course = kursi;
		subject = lenda;
		university = universitet;
		nrOfObjects++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	
	//funksione me tip void qe marrin si argument nje objekt te tipit Student dhe afishojne informacionin per te
	public static void displayInformation(Student st){
		System.out.printf("Student %s %s has this data:\n", st.name, st.surname);
		System.out.printf("Email: %s\nPhone Number: %s\nCourse: %s\nSubject: %s\nUniversity: %s\n", st.email, st.phone_number, st.course, st.subject, st.university);
	}
	
	public static String toString(Student st){
		return st.name + " " + st.surname + "\n\nEmail: " + st.email + "\tPhone number: " + st.phone_number + "\n\nCourse: "
				+ st.course + "\tSubject: " + st.subject + "\tUniversity: " + st.university;
	}
	
}
