package medals;

// TODO Javaの標準的なクラスライブラリであれば必要に応じてimportしてもよい

public class Medals implements Comparable {

        // TODO privateなメンバ変数は必要に応じて追加
	private String country;
	private int goldMedal=0; //実際は0で初期化されるから書かなくても差し支えない
	private int Silvermedal=0;
	private int Bronzemedal=0;
	
        // TODO 課題の指示に応じてpublicコンストラクタやpublicメソッドを実装

public Medals(String country){
	this.country = country;				
	}
//国の名前を持ってくる
public String getCountryName(){
	return country;
}
	
public void add(String Color){
	
	if(Color == "Gold") 
		Goldmedal++;
	if(Color == "Silver") 
		Silvermedal++;
	if(Color == "Bronze") 
		Bronzemedal++;
	
}

public int get(String Color){
	
	if(Color == "Gold") 
		return Goldmedal;
	if(Color == "Silver") 
		return Silvermedal;
	if(Color == "Bronze") 
		return Bronzemedal;
	
	
	return -1;
	
}

}