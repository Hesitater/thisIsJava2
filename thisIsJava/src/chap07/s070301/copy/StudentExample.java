package chap07.s070301.copy;

public class StudentExample {
	public static void main(String[] args) {
		Student student =new Student("김태희", "123456-1234567", 1);
		System.out.println("name : " + student.name);		//부모에서 물려받은 필드 출력
		System.out.println("ssn :" + student.ssn);			//부모에서 물려받은 필드 출력
		System.out.println("studentNo :" + student.studentNo);
	}
}
