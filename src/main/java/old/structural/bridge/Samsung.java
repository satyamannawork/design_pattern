package old.structural.bridge;

public class Samsung implements SamsungCharger {
  @Override
	public void getCharged(){
	  System.out.println("Samsung is being charged");
  }
}
