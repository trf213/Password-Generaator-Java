import java.util.*;

public class Passwords
{
	public static void main( String args[] )
	{
	Scanner scan = new Scanner(System.in);
	PasswordGenerator pass = new PasswordGenerator();
     int p = 0;
     System.out.println("Size of password");
       p = scan.nextInt();
       pass.generatePassword(p);  
        System.out.println(pass.getPassword());
    }

	
}