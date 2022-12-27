package student;

public class Student {
  public void getStudentinfo(int studentId) {
	  System.out.println(studentId);
  }
  public void getStudentinfo(int studentId,String studentName) {
	  System.out.println(studentId+","+studentName);
  }
  public void getStudentinfo(String email,Long phoneNumber) {
	  System.out.println(email+","+phoneNumber);
  }
  public static void main(String[] args) {
	Student obj=new Student();
	obj.getStudentinfo(10);
	obj.getStudentinfo(10, "MamaKutty");
	obj.getStudentinfo("mamakutty@gmail.com", 9494949494l);
}
}
