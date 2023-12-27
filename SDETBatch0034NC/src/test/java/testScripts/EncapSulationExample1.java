package testScripts;

public class EncapSulationExample1 {

	private int sRollNo = 101;
	private String sName = "Shareef";
	private long sContact = 9848022338l;
	private int sAge = 32;

	public int getsRollNo() {
		return sRollNo;
	}

	public void setsRollNo(int sRollNo) {
		this.sRollNo = sRollNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public long getsContact() {
		return sContact;
	}

	public void setsContact(long sContact) {
		this.sContact = sContact;
	}

	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
		System.out.println(sAge);
	}

}
