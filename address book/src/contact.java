
	import java.util.*;


	class Contact implements Comparable<Contact>
	{
	private String firstName;
	private String lastName;
	private long phoneNumber;

	Contact(String fname,String lname,long phno)
	{
	firstName=fname;
	lastName=lname;
	phoneNumber=phno;

	}
	void setFirstName()
	{
	this.firstName=firstName;
	}
	void setLastName()
	{
	this.lastName=lastName;
	}

	String getFirstName()
	{
	return firstName;
	}
	String getLastName()
	{
	return lastName;
	}


	@Override
	public int compareTo(Contact o)
	{
	return getFirstName().compareTo(o.getFirstName());
	}
	public static Iterator<Data> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	}



	class AddressBook
	{
	static Set<Contact> contacts;
	public AddressBook()
	{
	contacts= new TreeSet<Contact>();
	}

	public static void main(String a[])
	{
	AddressBook ob=new AddressBook();
	try {
		contacts.add(new Contact("shashank","mani",8804567889));
	} catch (Exception e) {
		e.printStackTrace();
	}
	contacts.add(new Contact("subhadip","bhattacharjee",90045067889));
	contacts.add(new Contact("sayantan","mishra",9894568089));
	contacts.add(new Contact("rajesh","sharma",12885607889));
	contacts.add(new Contact("ashutosh","pal",7834567889));
	contacts.add(new Contact("raja","pathak",6734567889));
	contacts.add(new Contact("mayank","sharma",2234467889));
	contacts.add(new Contact("bullu","verma",1234568809));
	contacts.add(new Contact("nimish","narayan",8256907834));
	contacts.add(new Contact("c.p","sharm",9256738890));


	Iterator it=contacts.iterator();
	while(it.hasNext())
	System.out.println(it.next());
	}



	}

