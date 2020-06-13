package example2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TeacherFactory teacherFactory=new TeacherFactory();
		Teacher teacher1=teacherFactory.getTeacher("111");
		Teacher teacher2=teacherFactory.getTeacher("222");
		Teacher teacher3=teacherFactory.getTeacher("111");
		Teacher teacher4=teacherFactory.getTeacher("444");
		System.out.println(teacher1.getNumber());
		System.out.println(teacher2.getNumber());
		System.out.println(teacher3.getNumber());
		System.out.println(teacher4.getNumber());
		if(teacher1==teacher3) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
