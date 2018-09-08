package corejava.collection;

/*class Question implements MyConstants{
	int ask() {
		return Yes;
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
}*/


class A {
	
	void test11() {
		System.out.println(" In class A ");
	}
	
}


class B extends A{
	
	void test11() {
		System.out.println(" In class B ");
	}
	
	
}


public class Main {
	
	public static void main(String arg[]) {
		
		A a = new B();
		a.test11();
		
		
		
		//B b = new A();
		
		
		
		/*Question q = new Question();
		answer(q.ask());*/
	}

	/*private static void answer(int result) {
		switch(result) {
		case No :
			System.out.println("N0");
		case Yes:
			System.out.println("YES" +Yes);
			
		}
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}*/

	
	
	
	
	
	
	
	
	
	
	
}


