import java.util.*;
import java.util.concurrent.ThreadLocalRandom; 

public class PasswordGenerator
{
	private String password;
	private char[] Symbols = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','@','/',')','(','{','}','%','#','$','^','&','*','+','=','!',';',':','.','|','~','<','>',',','?','[',']','-','_'};
	private int sizePassword;
	private int randpos;
	private  Random rand;
    private int nosymbols;
    private int allChar; 
    private int value;
    private boolean isIncluded;
   private  Scanner scan;

	PasswordGenerator()
	{
        sizePassword = 0;
        rand = new Random(); 
        scan = new Scanner(System.in);
        // randpos = rand.nextInt(78); 
         password = "";
         nosymbols = 62;
         allChar = 90;
        
       // randpos = ThreadLocalRandom.current().nextInt(78);
	}

public void generatePassword(int s)
{
	System.out.println("Would you like symbols to be encluded? Yes/No");
	int m = scan.nextInt();
	if(m == 1)
	{
		value = nosymbols;
	}
	else if (m == 0) 
	{
		value = allChar;
	}
	sizePassword = s;
	System.out.println(value);
	for(int i= 0; i < sizePassword; i++) 
	{
      password += Symbols[randpos];
      randpos = rand.nextInt(value); 
	}
	
}

public String getPassword()
{
	return password;
}

}