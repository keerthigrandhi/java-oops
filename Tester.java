
public class Tester {
	public static void main(String args[]) {
		ContackOperations op=new ContackOperations();
		Contact c= new Contact("Keerthi",1234,"Family");
		Contact c7= new Contact("Krishna",788,"friends");
		Contact c1= new Contact("preethi",755,"others");
		Contact c2= new Contact("Deepthi",567,"Family");
		Contact c3= new Contact("abhi",587,"Family");
		Contact c4= new Contact("abhiram",4674,"others");
		Contact c5= new Contact("Raj",7555,"friends");
		Contact c6= new Contact("raj",87564,"family");
		
		op.addContact(c);
		op.addContact(c1);
		op.addContact(c2);
		op.addContact(c3);
		op.addContact(c4);
		op.addContact(c5);
		op.addContact(c7);
		op.addContact(c6);
		
	}

}
