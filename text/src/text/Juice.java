package text;

interface WhichJuice{
	public String getJuiceType();
}

public class Juice implements WhichJuice{
	public String getJuiceType(){
		return "Orange Juice";
	}
}
