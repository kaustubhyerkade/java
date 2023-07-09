import java.util.Scanner;


public class EditBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		/*
		Book b1=new Book(111,"kos",111.11);
		Book b2=new Book(0,"",0);
		
		Book b3=b1;
		
		b3.setBookId(11);
		b3.setBookName("HHAHA");
		b3.setBookPrice(12.34);
		*/
        
		public static void Accept()
		{
		 
        System.out.println("Enter Total no of books");
        int n=sc.nextInt();
        Book arr[]=new Book[n];
        for(int i=0;i<arr.length;i++)
        {
        	
        	System.out.println("Enter id name Price");
        	
        	arr[i]=new Book(sc.nextInt(),sc.next(),sc.nextDouble());
        	
        }
        
		}
		public static void Disp(){
         for(Book b:arr)
        {
        	
        	System.out.println("Book id :    "+b.getBookId()+ "   Book Name :"+b.getBookName()+"   Book Price:"+b.getBookPrice());
        }
	
		}   
        
	

	/*
		// TODO Auto-generated method stub
		System.out.println("Book id   : "+b1.getBookId());
		System.out.println("Book Name : "+b1.getBookName());
		System.out.println("Book Price: "+b1.getBookPrice());
	    System.out.println("______________________________________________________");
		System.out.println("Book id   : "+b2.getBookId());
		System.out.println("Book Name : "+b2.getBookName());
		System.out.println("Book Price: "+b2.getBookPrice());
		System.out.println("______________________________________________________");
		System.out.println("Book id   : "+b3.getBookId());
		System.out.println("Book Name : "+b3.getBookName());
		System.out.println("Book Price: "+b3.getBookPrice());
	*/
	}
	
}

