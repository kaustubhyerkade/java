import java.util.Scanner;



public class Encapsulation {

	private String name;
	private int age;
	private int roll;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getRoll() {
		return roll;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
}

class TestEncapsulation{
	public static void main(String args[])
	{
	   Scanner sc =new Scanner(System.in);
       Encapsulation e =new Encapsulation();
       
       System.out.println("Enter Name : ");
       
       //String nm=sc.next();
       e.setName(sc.next());
       System.out.println("Enter Age : ");
      // int ag = sc.nextInt();
       e.setAge(sc.nextInt());
       System.out.println("Enter Rollno : ");
       //int rn=sc.nextInt();
       e.setRoll(sc.nextInt());
       
       System.out.println("Name is : "+ e.getName()+ " Age is :"+e.getAge()+" Roll no is :"+e.getRoll());
		
	}
	
}