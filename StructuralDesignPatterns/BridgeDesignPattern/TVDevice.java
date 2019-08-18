public class TVDevice extends EntertainmentDevice{

	public TVDevice(int currentState) {
		this.currentState = currentState;
	}
	@Override
	public void pressButtonUp() {
		currentState++;
		System.out.println("Current Channel: "+currentState);
	}

	@Override
	public void pressButtonDown() {
		currentState--;
		System.out.println("Current Channel: "+currentState);
	}

}
