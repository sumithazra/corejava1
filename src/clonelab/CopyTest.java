package clonelab;

public class CopyTest {

	public static void main(String[] args) {
		
		Student stud=new Student("jhon", "algebra");
		System.out.println("Original object :"+ stud.getName()+" - "+ stud.getSubj().getName());
		
		//Clone object
		
		Student cloneStud= (Student)stud.clone();
		
		System.out.println("Cloned Object :" +cloneStud.getName()+"-"+ cloneStud.getSubj().getName());
		
		
		
		stud.setName("Daniyal");
		stud.getSubj().setName("Physics");
		System.out.println("Original object after it id Updated :"+ stud.getName()+" - "+ stud.getSubj().getName());
		
		System.out.println("Clone Object after updating Original Object:" +cloneStud.getName()+"-"+ cloneStud.getSubj().getName());
		
		
		
	}

}
