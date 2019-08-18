
public class MainClass {
	
	public static void main(String[] args){
		System.out.println("hello");
		Remote TV = new TVRemote(new TVDevice(20));
		Remote TV2 = new TVRemoteAdvanced(new TVDevice(20));
		
		TV.pressButtonLeft();
		TV.pressButtonRight();
		TV.pressButtonCenter();
		
		TV2.pressButtonLeft();
		TV2.pressButtonRight();
		TV2.pressButtonCenter();
	}
}
