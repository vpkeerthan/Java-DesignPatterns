
public class TVRemote extends Remote{

	public TVRemote(EntertainmentDevice device) {
		super(device);
	}

	@Override
	public void pressButtonCenter() {
		System.out.println("Clicking on OK Button");
	}

}
