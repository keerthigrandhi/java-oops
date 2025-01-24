import java.util.ArrayList;

public class ContackOperations {
	
	ArrayList<Contact> contacts =new ArrayList();
	public boolean addContact(Contact c)
	{
		for(Contact temp:contacts) {
			if(temp.getMobileNumber() == c.getMobileNumber()) {
				System.out.println("Duplicate mobile number");
				return false;
			}
		}
		contacts.add(c);
		return false;
	}
	public ArrayList<Contact> searchByByte(String type){
		ArrayList<Contact> list =new ArrayList();
		for (Contact temp: contacts)
		{
			if(temp.getType().equals(type))
			{
				list.add(temp);
			}
		}
		return list;
	}
	public ArrayList<Contact> searchByKey(String key){
		ArrayList<Contact> list =new ArrayList();
		for (Contact temp: contacts) {
			if(temp.toString().contains(key)) {
				list.add(temp);
			}
		}
		return list;
	}
	

}
