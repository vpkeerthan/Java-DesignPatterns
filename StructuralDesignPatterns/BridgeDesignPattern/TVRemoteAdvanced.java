
public class TVRemoteAdvanced extends Remote{

	public TVRemoteAdvanced(EntertainmentDevice device) {
		super(device);
	}

	@Override
	public void pressButtonCenter() {
		System.out.println("Clicking on iTV info button");
	}

}
