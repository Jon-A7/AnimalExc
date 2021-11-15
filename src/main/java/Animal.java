
public class Animal implements Carnivore, Omnivore {
	private int biteForce;
	private int jumpHeight;
	

	public Animal() {
		
	}
	
	public Animal(int biteForce, int jumpHeight) {
		super();
		this.biteForce = biteForce;
		this.jumpHeight = jumpHeight;
	}


	public int getBiteForce() {
		return biteForce;
	}


	public void setBiteForce(int biteForce) {
		this.biteForce = biteForce;
	}


	public int getJumpHeight() {
		return jumpHeight;
	}


	public void setJumpHeight(int jumpHeight) {
		this.jumpHeight = jumpHeight;
	}


	public void printJump() {
		
	}
	
	public void printBiteForce() {
		
	}

	public boolean isAnOmnivore() {
		
		return false;
	}

	public boolean isACarnivore() {
		
		return false;
	}

}
