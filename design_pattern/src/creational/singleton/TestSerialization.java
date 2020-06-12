package creational.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;


public class TestSerialization {
	
	@Test
	public void test01() throws FileNotFoundException, IOException, ClassNotFoundException {
		HungrySingleton instance=HungrySingleton.getInstance();
		File file=new File("singleton_file");
		//序列化过程：将对象输出至文件
		ObjectOutputStream ooStream=new ObjectOutputStream(new FileOutputStream(file));
		ooStream.writeObject(instance);
		System.out.println(instance.hashCode());//931496835
		//反序列化过程：从文件中读出内容转化为对象
		ObjectInputStream oiStream=new ObjectInputStream(new FileInputStream(file));
		System.out.println(oiStream.readObject().hashCode());//1437941060
		
	}
}
