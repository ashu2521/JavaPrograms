
public class member_innerClass {
	public static void main(String[] args){
		member m1 = new member();
		System.out.println(m1.b);
		member.inner in = m1.new inner();
		
		//System.out.println(in.b);
		in.show();
		member m2 = new member(){
			int n = 10;
			public void show(){
				System.out.println("fORK them all : " + n);
			}
		};
		
		m1.show();
	}
}

class member{
	static int b = 10;
	void show(){
		System.out.println("HELLO");
	}
	
	class inner{
	//	int b = 23;
		void show(){
			System.out.println(b);
		}
	}
}