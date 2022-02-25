import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class AdressBook {

	
	
	public static void main(String[] args) {
		contact contact = new contact();
		Scanner  sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter the Email ID");
		String emailId = sc.nextLine();
		contact.setEmailId(emailId);
		
		System.out.println("Enter the PhoneNumber");
		String phoneNumber = sc.nextLine();
		contact.setPhoneNumber(phoneNumber);
		
		System.out.println(contact); 
		
		
		System.out.println("Enter the First name");
		String firstName = sc.nextLine();
		String resultPattern = "[A-Z]{1}[a-z]{2,9}$";
		Pattern regex = Pattern.compile(resultPattern);
		Matcher inputMatcher = regex.matcher("Subhadip");
		System.out.println(inputMatcher.matches());
		
		
		while(!inputMatcher.matches()) {
			System.out.println("Invalid first name");
			System.out.println("length must not exceeds 10 (Exa: Subhadip). Try again");
			firstName = sc.nextLine();
			inputMatcher = regex.matcher(firstName);
			
		}
		return firstName;
	}
		
		
		}
		
		
		
		
		
		
 
	}

}
