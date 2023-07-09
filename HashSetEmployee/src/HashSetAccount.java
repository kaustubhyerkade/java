
import java.awt.*;
import java.util.Set;
import java.util.TreeSet;
class HashSetAccount{
	public static void main(String args[])
	{
		Account a1 = new Account(123,"Kua",1000);
		Account a2 = new Account(124,"stu",2000);
		Account a3 = new Account(125,"bha",3000);



		Set<Account> st = new TreeSet<Account>();
		st.add(a1);
		st.add(a2);
		st.add(a3);


		for(Account a:st)
		{
			System.out.println(a);
		}

	}


}