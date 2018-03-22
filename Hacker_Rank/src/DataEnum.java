
public enum DataEnum {
	SUMMER(1, 2), WINTER(4, 5), AUTUMN(9, 10), SPRING(11, 1);	
	private int a;
	private int b;
	private DataEnum(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public String getValue(){
		return String.format("a: %d\nb: %d", a, b);
	}
	
}
