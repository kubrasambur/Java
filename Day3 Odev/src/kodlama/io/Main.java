package kodlama.io;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Berkay");
		student.setLastName("Ergün");
		student.setStudentNumber("181002025");
		
		Instructor inst= new Instructor();
		inst.setId(2);
		inst.setFirstName("Engin");
		inst.setLastName("DEMİROĞ");
		inst.setInstructorNumber("EN101");
		
		InstructorManager intmanager = new InstructorManager();
		intmanager.addInstructor(inst);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
		User[] users = {inst};
		UserManager userManager=new UserManager();
		userManager.addMultiple(users);
		
		
		
	}

}
