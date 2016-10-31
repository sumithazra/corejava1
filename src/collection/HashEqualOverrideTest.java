package collection;
import java.util.*;
import java.util.Map.Entry;

public class HashEqualOverrideTest {	
	public static void main(String[] args) {
	
				
		Movie m = new Movie();
		m.setActor("Akshay");
		m.setName("Thank You");
		m.setReleaseYr(2011);

		Movie m1 = new Movie();
		m1.setActor("Akshay");		 
		m1.setName("Khiladi");		
		m1.setReleaseYr(1993);
		
		Movie m2 = new Movie();
		m2.setActor("Akshay");
		m2.setName("Taskvir");
		m2.setReleaseYr(2010);
		 
		Movie m3 = new Movie();
		m3.setActor("Akshay");
		m3.setName("Taskvir");
		m3.setReleaseYr(2010);
		 
		Movie m4 = new Movie();
		m4.setActor("Akshay");
		m4.setName("Taskvir");
		m4.setReleaseYr(2010);
		 
	 Map<Movie,String> map=new HashMap<Movie,String>();
	 map.put(m, "Zero");
	 map.put(m1, "One");
	 map.put(m2, "Two");
	 map.put(m3, "Three");
	 map.put(m4, "Four");
	 
	 
	
	 
	// 
	 System.out.println("Priniting the hashCode for the all different Movie object");
	 System.out.println(m.hashCode());
	 System.out.println(m1.hashCode());
	 System.out.println(m2.hashCode());
	 System.out.println(m3.hashCode());
	 System.out.println(m4.hashCode());
	 System.out.println("");
	 
	
	 
	 
	// Iterating over hash map
	 System.out.println("Iterating over the HashMap");
		Set<Entry<Movie, String>> entry = map.entrySet();
		Iterator entryIterator = entry.iterator();

		while (entryIterator.hasNext()) {
			Entry<Movie, String> e = (Entry<Movie, String>) entryIterator
					.next();
			System.out.println(e.getKey().hashCode() + "< ----------->" + e.getValue());

		}

	System.out.println("-------------------");
	System.out.println("M4 and M3 should have same value || lets check ");
	System.out.println("M4 hashCode:" +m4.hashCode()+ " M3 hashCode:"+m3.hashCode());
	if(m4.hashCode()==m3.hashCode())
	{
		System.out.println("M4 and M3 has same hashCode");
	}
	 
	 
	 
	System.out.println("");
	System.out.println("-------------------");
	System.out.println("M4 and M3 had same value");	 
	System.out.println(m4.equals(m3));
	
	 
		if (map.get(m4) == null) {
			System.out.println("----------------");
			System.out.println("Object not found");
			System.out.println("----------------");

		} else {
			System.out.println(map.get(m4));
		}
		
		Department d1=new Department("1","Mathematics");
		Department d2=new Department("2", "Physics");
		Department d3=new Department("3","Chemistry");
		Department d4=new Department("4","English");
		
		Map<Movie,Department> hm=new HashMap<Movie,Department>();
		 hm.put(m1,d1);
		 hm.put(m2, d2);
		 hm.put(m, d3);
		 hm.put(m3, d4);
		 
		 Set<Map.Entry<Movie,Department>> entrySet=hm.entrySet();
		  
		Iterator<Entry<Movie, Department>> ite= entrySet.iterator();
		 
		 while(ite.hasNext())
		 {
			 Entry e=ite.next();
			 System.out.println(e.getKey()+" "+ e.getValue() );
			  
			 
		 }
	
		 System.out.println(hm);
	
	}

	
		
	
}

class Department{
	
	String id;
	String name;
	
   Department(String id,String name)
   {
	   this.id=id;
	   this.name=name;
	   
   }
   
   public String toString()
   {
	   
	   return "Department id:"+id+ " name :"+name;
   }
}

// #Movie Class definition 
 class Movie {
	 
	    private String name, actor;
	    private int releaseYr;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getActor() {
			return actor;
		}
		public void setActor(String actor) {
			this.actor = actor;
		}
		public int getReleaseYr() {
			return releaseYr;
		}
		public void setReleaseYr(int releaseYr) {
			this.releaseYr = releaseYr;
		}
		
	
		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((actor == null) ? 0 : actor.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + releaseYr;
			return result;
		}
/*		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Movie other = (Movie) obj;
			if (actor == null) {
				if (other.actor != null)
					return false;
			} else if (!actor.equals(other.actor))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (releaseYr != other.releaseYr)
				return false;
			return true;
		}
				*/
		
 }