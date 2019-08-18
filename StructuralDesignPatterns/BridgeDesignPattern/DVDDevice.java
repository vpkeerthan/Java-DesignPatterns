
public class DVDDevice extends EntertainmentDevice{
	
	public DVDDevice(int currentState) {
		this.currentState = currentState;
	}
	
	@Override
	public void pressButtonUp() {
		currentState++;
		System.out.println("Current Folder: "+currentState);
	}

	@Override
	public void pressButtonDown() {
		currentState--;
		System.out.println("Current Folder: "+currentState);
	}

}
