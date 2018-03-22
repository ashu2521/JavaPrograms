
public class enumaration {
	public static void main(String args[]){
		DataEnum season = DataEnum.SUMMER;
		//System.out.println(season);
		for(DataEnum s : DataEnum.values()){
			System.out.println(s);
		}
		System.out.println(season.getValue());
		
	}
}
