
public class Fasade {

	private SubSystemA ob1 = new SubSystemA();
	private SubSystemB ob2 = new SubSystemB();
	private SubSystemC ob3 = new SubSystemC();
	
	public void method() {
		ob1.MethodA();
		ob2.MethodB();
		ob3.MethodC();
	}
}
