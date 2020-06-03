
public class Contact {
	
	private String firstname;
	private String lastname;
	public Contact(String firstname,String lastname)
    {
		
		this.firstname=firstname;
		this.lastname=lastname;
    } 
	public Contact() {
		this(null, null);
	}
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Contact [firstname=" + firstname + ", lastname=" + lastname + "]";
	}

	
	public static void main(String[] args) throws Exception
    {
		
		Contact contact = new PersonalContact();
		Contact.saveContact(contact);
	}
	
	public final String save() {
		return null;
	}
	
	public void nonFinalMethod () {
		
	}
	
	
	public static void saveContact(Contact contact) throws Exception
    {
		if(contact instanceof CorporateContact) {
			System.out.println("Ready for saving");
		} else  {
			throw new Exception();
		}
	}

}

interface CorporateContact {
	
}


class PersonalContact extends Contact{
	
	public String save(String s) {
		return null;
	}
	
	public final void nonFinalMethod() {
		
	}
	
}

class PrivateContact  extends Contact implements CorporateContact{ 
	
	
}