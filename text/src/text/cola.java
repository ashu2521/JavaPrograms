package text;

public class cola <T extends DietCoke>{
	T t;
	cola(T t){
		this.t = t;
	}
	public String getAll(){
		String ar = String.format("T : %s\nM : %d", t.getT(), t.getM());
		return ar;
	}
}
