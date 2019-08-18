//abstract class
public abstract class EntertainmentDevice {
	
	public int currentState;	//Current channel(TV) or chapter(DVD) or frequency channel(FM)
	public int volumeLevel = 0;	//Current volume
	
	public abstract void pressButtonUp();
	public abstract void pressButtonDown();
	
  public void pressButtonLeft(){
		volumeLevel--;
		System.out.println("Volume at level: "+volumeLevel);
	}
	
  public void pressButtonRight(){
		volumeLevel++;
		System.out.println("Volume at level: "+volumeLevel);
	}
}
