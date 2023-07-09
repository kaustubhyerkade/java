import java.util.*;

public class TestAccount {

	public static void main(String args[])
	{


		List<Account> lst = accept(); 
		display(lst);
		
	}

     public static List<Account> accept()
     {
    	 Scanner sc = new Scanner(System.in);
    	 List<Account> lst = new ArrayList<Account>();
    	
    	 /*
    	 Account a1 =new Account(111,"stu",5000);
    	 Account a2 =new Account(112,"Kau",6000);
    	 Account a3 =new Account(113,"ubh",7000);
    	 
    	 lst.add(a1);
    	 lst.add(a2);
    	 lst.add(a3);
    	 */
    	 do{
    		 
    		 System.out.println("Enter Eid , Ename , EBalance");
    		
    		 lst.add(new Account(sc.nextInt(),sc.next(),sc.nextFloat()));
    		 
    		 System.out.println("Want to add more?");
    	 }while(sc.nextInt()==1);
    	 
    	 
    	 return lst;
    	 
     }
     
     public static void display(List<Account> lst)
     {
    	 for(Account a:lst)
    	 {
    		 System.out.println(a.getEid()+"\t"+a.getEname()+"\t"+a.getEbal());
    		 System.out.println(a);//to string  method
    	 }
    	 
    	 
    	 
    	 
     }
     

}
