package old.structural.adaptor;

public class Samsung implements SamsungCharger {
  @Override
	public void getCharged(){
	  System.out.println("Samsung is being charged");
  }
}
