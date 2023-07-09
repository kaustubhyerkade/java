package jdbcconn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class TestConn {
	public static void main(String args[]) throws SQLException
	{
		try 
		{
			Class.forName("oracle.jdbc.OracleDriver");
		} 
		catch (ClassNotFoundException e1) {

			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("Driver failed to load");
		}
		Connection con = null;
		try 
		{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","Kosmos123#");
			System.out.println("Connection is successful");
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("not successful");
		}
	

		PreparedStatement ps = null;
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("Enter id to delete record :");
		int eid=sc.nextInt();
        try {
	    ps=con.prepareStatement("delete from EMP where empId=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			ps.setInt(1, eid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        int i = 0;
		try {
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        if(i>0)
        {
        	System.out.println("Deleted");
        }
		
        sc.close();
        */
      
        int ch;
		//////////////////////////////////////////////////////
        do{
       
        System.out.println("1.Insert \n 2.update \n 3.Delete \n 4.Search \n 5.Display \n 6.Display2");
        ch= sc.nextInt();
        Statement st;
		ResultSetMetaData rsmd;
		switch(ch)
        {
        case 1:
        	System.out.println("Enter id, name , salary");
        	ps= con.prepareStatement("insert into EMP values(?,?,?)");
        	ps.setInt(1, sc.nextInt());
        	ps.setString(2, sc.next());
        	ps.setInt(3, sc.nextInt());
        	int j = ps.executeUpdate();
        	if(j>0)
        	{
        		System.out.println("Record Inserted");
        	}
        	
        break;

        case 2:
        	System.out.println("Enter id, new name ,new  salary");
        	ps= con.prepareStatement("update EMP set EMPNAME = ?, EMPSAL= ? where EMPID=?");
        	ps.setInt(3, sc.nextInt());
        	ps.setString(1, sc.next());
        	ps.setInt(2, sc.nextInt());
        	int k = ps.executeUpdate();
        	if(k>0)
        	{
        		System.out.println("Record Updated");
        	}
        	
        	
        	
            break;
        case 3:
        	System.out.println("Enter id to delete record");
        	ps= con.prepareStatement("delete from EMP where EMPID=?");
        	ps.setInt(1, sc.nextInt());
        	
        	int l = ps.executeUpdate();
        	if(l>0)
        	{
        		System.out.println("Record Deleted!");
        	}
        	
        	
            break;
        case 4:
        	System.out.println("Enter id to search record");
        	ps= con.prepareStatement("select * from EMP where EMPID=?");
        	ps.setInt(1, sc.nextInt());
        	
        	ResultSet rs;
            rs = ps.executeQuery();
            while(rs.next())
            {
            	System.out.println(rs.getString("EMPID"));
            	System.out.println(rs.getString("EMPNAME"));
            	System.out.println(rs.getString("EMPSAL"));
            }
        	
        	int m = ps.executeUpdate();
        	
        	
        	if(m>0)
        	{
        		System.out.println("Records fetched ");
        	}
            break;

        case 5:
        	
        	//not proper !!!!!!!!!!!!!!
        	System.out.println("Total Records");
        	ps= con.prepareStatement("select * from EMP");
        	 rs = ps.executeQuery();
        	while(rsx))
            {
            	System.out.println(rs.getString("EMPID")+"  "+rs.getString("EMPNAME")+"  "+(rs.getString("EMPSAL")));
            	System.out.println();
            	
            }
        	
        	
        	
        	int n = ps.executeUpdate();
        	
        	if(n>0)
        	{
        		System.out.println("Records fetched: "+rs.getFetchSize());
        	}         	
            break;
        
          
        case 6:
        	//proper method
        	String str="select * from EMP";
        	st=con.createStatement();
        	rs=st.executeQuery(str);
        	rsmd =rs.getMetaData();
        	
        	for(int i=1;i<=rsmd.getColumnCount();i++)
        	{
        		System.out.print(rsmd.getColumnName(i)+"\t");
        	}
        	System.out.println("\n.............................................\n");
        	while(rs.next())
        	{
        		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
        	}	
        	
        	break;
            
        }	
        	
        }while(ch!=7);
        
        
        
        sc.close();
        
	}
}
