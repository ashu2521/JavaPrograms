package text;

public class DietCoke<T, M> extends liquid<T>{
	private M m;
	DietCoke(T t, M m){
		super(t);	
		this.m = m;
	}
	M getM(){
		return m;
	}
}
