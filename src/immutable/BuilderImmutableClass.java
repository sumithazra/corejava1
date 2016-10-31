package immutable;

import java.util.HashMap;
import java.util.Iterator;

public class BuilderImmutableClass {

	private  int id;
	private  String name;
	private  HashMap<String, String> testMap;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public HashMap<String, String> getTestMap() {
		return (HashMap<String, String>)testMap.clone();
	}
	private BuilderImmutableClass(ImmutableInnerClass imi)
	{
		this.id=imi.id;
		this.name=imi.name;
		this.testMap=imi.testMap;
		
	}
	static class ImmutableInnerClass
	{
		
		private  int id;
		private  String name;
		private  HashMap<String, String> testMap;
		
		ImmutableInnerClass(int i, String n) {
			System.out.println("Performing Deep Copy for Object initialization");
			this.id = i;
			this.name = n;
					}
		
		
		public void setTestMap(HashMap<String, String> testMap) {
			this.testMap = (HashMap<String, String> )testMap.clone();
		}


		public BuilderImmutableClass build()
		{
			return new BuilderImmutableClass(this); 
			
		}
		
		
	}
	
}
