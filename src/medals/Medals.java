package medals;

// TODO Javaの標準的なクラスライブラリであれば必要に応じてimportしてもよい

public class Medals implements Comparable {

	// TODO privateなメンバ変数は必要に応じて追加
	private String country;
	private int goldMedal=0; //実際は0で初期化されるから書かなくても差し支えない
	private int silverMedal=0;
	private int bronzeMedal=0;

	// TODO 課題の指示に応じてpublicコンストラクタやpublicメソッドを実装

	public Medals(String country){
		this.country = country;				
		this.goldMedal = get("Gold");
		this.silverMedal = get("Silver");
		this.bronzeMedal = get("Bronze");
	}
	//国の名前を持ってくる
	public String getCountryName(){
		return country;
	}

	public void add(String Color){

		if(Color.equals("Gold")) 
			goldMedal++;
		if(Color.equals("Silver")) 
			silverMedal++;
		if(Color.equals("Bronze")) 
			bronzeMedal++;

	}

	public int get(String Color){

		if(Color.equals("Gold")) 
			return goldMedal;
		if(Color.equals("Silver")) 
			return silverMedal;
		if(Color.equals("Bronze")) 
			return bronzeMedal;


		return -1;

	}

	public String toString(){

		int sum = this.goldMedal + this.silverMedal + this.bronzeMedal;

		return "「" + this.country + "」" + "(" + this.goldMedal + "," + this.silverMedal + "," + this.bronzeMedal + ")[" + sum + "]";

	}

	@Override
	public int compareTo(Object o) {
	
	//	Medals a = 
		
		if(o instanceof Medals){//もしobjectがMedalsにキャストできたら
			
			for(int i = 0 ; i<0 ; i++){
			
			}
			
		}
		
		return 0;
	}

}