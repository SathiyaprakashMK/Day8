package week5.day2;

public class Automation extends MultipleLanguage implements Language,TestTool{

	public static void main(String[] args) {
		Automation auto=new Automation();
		auto.java();
		auto.selenium();
		auto.python();
		auto.ruby();

	}
	public void ruby() {
		System.out.println("Ruby");
	}

	public void selenium() {
		System.out.println("Selenium");
	}

	public void java() {
		System.out.println("Java");
	}
	public void Selenium() {
		// TODO Auto-generated method stub
		
	}

}
