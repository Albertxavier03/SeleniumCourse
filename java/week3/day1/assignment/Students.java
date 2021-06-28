package week3.day1.assignment;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println(id);

	}
	public void getStudentInfo(int id ,String name ) {
		System.out.println(id + "  " + name);

	}
	public void getStudentInfo(String email, Long phoneNumber) {
		System.out.println(email+ "  " + phoneNumber);

	}
	
	public static void main(String[] args) {
		Students std = new Students();
		std.getStudentInfo(453);
		std.getStudentInfo(234, "Joe");
		std.getStudentInfo("joe@gmail.com", 9876543210L);

	}

}
