package clonelab;

public class Clonetest {

	public static void main(String[] args) {
		ValueStore v1=new ValueStore("1","one");
		System.out.println(v1);
		ValueStore v2=null;
		try {
			 v2=(ValueStore) v1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(v2);
	}	
	
}

final class ValueStore implements Cloneable
{
String id;
String value;

ValueStore(String id,String value)
{
this.id=id;
this.value=value;

}

public String toString()
{
	return "valueStore id:"+id+" value:"+value;
}

protected Object clone() throws CloneNotSupportedException
{
	
//	throw new CloneNotSupportedException();
	
	return super.clone();
	
}



}