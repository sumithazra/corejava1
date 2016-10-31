package clonelab;

public class Student implements Cloneable {

	
	private Subject subj;
	
	private String name;

	public Subject getSubj() {
		return subj;
	}

	public void setSubj(Subject subj) {
		this.subj = subj;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Student(String s, String sub)
	{
		name=s;
		subj=new Subject(sub);
	}
	
	
	public Object clone()
	{
		
		/*try{
			return super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			return null;
		}*/
		
		Student s = new Student(name, subj.getName());
		return s;
	}
	
}
