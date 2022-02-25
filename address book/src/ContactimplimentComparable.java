import java.util.Set;
import java.util.TreeSet;

public class ContactimplimentComparable<contact> {

	public static void main(String[] args) {
		class Contact implements Comparable<Contact> {
			private String firstName;
			private String lastName;
			private String phoneNumber;
		@Override
			public int compareTo(Contact o) {
				return getFirstName().compareTo(o.getFirstName());
			}
		private String getFirstName() {
			// TODO Auto-generated method stub
			return null;
		}
		}

		class AddressBook {
			Set<Contact> contacts;
			public AddressBook() {
				contacts = new TreeSet<Contact>();
			}
		}

	}

}
