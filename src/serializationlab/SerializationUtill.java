package serializationlab;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationUtill {

	public static void objcetSerialize(File filename, Object obj) throws IOException,ClassNotFoundException
	{
		FileOutputStream fos=new FileOutputStream(filename);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(obj);
		fos.close();		
	}
		public static Object ObjcetDeSerialize(File filename) throws IOException, ClassNotFoundException 
		{
			FileInputStream fis=new FileInputStream(filename);
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object obj=ois.readObject();
			return obj;
			
		}
}
