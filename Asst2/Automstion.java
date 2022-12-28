package Asst2;

public class Automstion extends MultipleLanguage implements Language,TestTool{

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby");
	}

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("selenium");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("java");
	}
    public static void main(String[] args) {
    	Automstion  obj=new Automstion();
    	obj.java();
    	obj.selenium();
    	obj.python();
    	obj.ruby();
	}
}
