package text;

public class Glass <T extends WhichJuice>{
	private T juice;
	Glass(T juice){
		this.juice = juice;
	}
	public String getJuice(){
		return juice.getJuiceType();
	}
}
