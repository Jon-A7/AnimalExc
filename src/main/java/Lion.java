
public class Lion extends Animal {
private String gender;
private boolean injured;

public Lion() {
	
}

public Lion(String gender, boolean injured) {
	super();
	this.gender = gender;
	this.injured = injured;
}

public void roar() {
	System.out.println("The lion roars");
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public boolean isInjured() {
	return injured;
}
public void setInjured(boolean injured) {
	this.injured = injured;
}


}
