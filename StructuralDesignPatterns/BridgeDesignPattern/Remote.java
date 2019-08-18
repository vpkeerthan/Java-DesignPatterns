//Abstract Class
public abstract class Remote {
	
	private EntertainmentDevice device;
	
	public Remote(EntertainmentDevice device) {
		this.device = device;
	}
	
	public void pressButtonLeft(){
		device.pressButtonLeft();
	}
	
	public void pressButtonRight(){
		device.pressButtonRight();
	}
	
	public abstract void pressButtonCenter();
}
