import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
	int rno;
	String sname;
	double per;
	public Student(int rno, String sname, double per) {
		this.rno = rno;
		this.sname = sname;
		this.per = per;
	}
	public String toString() {
		return "Student [rno=" + rno + ", sname=" + sname + ", per=" + per + "]";
	}
	
}
public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student s1=new Student(1, "Jigar", 76);
		FileOutputStream fos=new FileOutputStream("ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.flush();
		oos.close();
		System.out.println("Object Written Successfully");
		
		FileInputStream fis=new FileInputStream("ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student s2=(Student)ois.readObject();
		ois.close();
		System.out.println(s2);
	}
}
