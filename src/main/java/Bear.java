
public class Bear extends Animal {
	private String subspecies;
	private String colour;
	private int pawWidth;
	
	public Bear() {
		
	}
	
	public Bear(String subspecies, String colour, int pawWidth) {
		super();
		this.subspecies = subspecies;
		this.colour = colour;
		this.pawWidth = pawWidth;
	}
	
	public void growl() {
		System.out.println("The bear growls");
	}
	
	public String getSubspecies() {
		return subspecies;
	}
	public void setSubspecies(String subspecies) {
		this.subspecies = subspecies;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getPawWidth() {
		return pawWidth;
	}
	public void setPawWidth(int pawWidth) {
		this.pawWidth = pawWidth;
	}

	
}
