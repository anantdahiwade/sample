package java.util;

public class scanner {
	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the name : ");
	String name=sc.nextLine();
	System.out.println("Enter your sem : ");
	int sem=sc.nextInt();
	System.out.println("Enter your CGPA : ");
	 float cgpa=sc.nextFloat();
	 System.out.println("\n Details : ");
	 System.out.println("Name : " +name);
	 System.out.println("Sem : "+sem);
	 System.out.println("CGPA : "+cgpa);
	 System.out.println("You have got the job");
	

}
}