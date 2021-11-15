
public class Wolf extends Animal{
	private String senseOfSmell;
	private String country;
	private int packMembers;
	
	public Wolf() {
		
	}
	
	public Wolf(String senseOfSmell, String country, int packMembers) {
		super();
		this.senseOfSmell = senseOfSmell;
		this.country = country;
		this.packMembers = packMembers;
	}
	
	public void snarl() {
		System.out.println("The wolf snarls");
	}
	
	public String getSenseOfSmell() {
		return senseOfSmell;
	}
	public void setSenseOfSmell(String senseOfSmell) {
		this.senseOfSmell = senseOfSmell;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPackMembers() {
		return packMembers;
	}
	public void setPackMembers(int packMembers) {
		this.packMembers = packMembers;
	}
	
	
	

}
