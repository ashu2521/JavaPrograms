
public class LambdaExp {
	public static void main(String[] args){
		A a = new A(){
			void show1(){
				System.out.println("AN1 : SHOW1");
			}
			void show2(){
				System.out.println("AN1 : SHOW2");
			}
		};
		a.show1();
		a.show2();
		
		A b = new B();
		b.show1();
		b.show2();
		
		A c = new A(){
			void show1(){
				System.out.println("AN2 : SHOW1");
			}
			void show2(){
				System.out.println("AN2 : SHOW2");
			}
		};
		c.show1();
		c.show2();
		
		
		
		
		first f1 = () ->{
			System.out.println("LAMBDA1");
		};
		f1.method();
		
		
		first f2 = () -> System.out.println("LAMBDA2");
		f2.method();
		
		char z = '1';
		
		System.out.println(Character.getNumericValue(z));
	}
}

abstract class A{
	abstract void show1();
	void show2(){
		System.out.println("A : SHOW2");
	}
}

class B extends A{
	void show1(){
		System.out.println("B : SHOW1");
	}
	void show2(){
		System.out.println("B : SHOW2");
	}
}

@FunctionalInterface
interface first{
	public void method();
}