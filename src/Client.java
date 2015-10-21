
public class Client {

	private static Fasade fasade = new Fasade();
	public static void main(String arg[]) {
		fasade.method();
	}
}
//注意：FacadePate相当于就是弄一个中间件，免得类之间相互调用太多的。