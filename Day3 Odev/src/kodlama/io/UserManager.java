package kodlama.io;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getId()+" "+user.getFirstName()+" "+ user.getLastName() +" "+ "Eklendi");
		
	}	
	public void delete(User user) {
		System.out.println(user.getId()+" "+user.getFirstName()+" "+ user.getLastName() +" "+ "Silindi");
	}
		
	public void addMultiple(User[] users) {
		for(User user : users) {
			add(user);
		}
		System.out.println("Multiple eklendi");
		
	}
	
	
}
