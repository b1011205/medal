package medals;

//TODO Javaの標準的なクラスライブラリであれば必要に応じてimportしてもよい
import java.util.*;

/**
 * @author 学籍番号 氏名
 *
 */
public class Ranking {

	// TODO privateなメンバ変数は必要に応じて追加
	// TODO Tには適切なクラス名を記述
	private ArrayList<Medals> results = new ArrayList<Medals>(); 

	public Ranking(String country,String medal) {
		//　TODO 必要な処理があれば追加
	
	}

	/**
	 * 指定された国のメダル情報がresultsに格納されているか探し、あればそれを
返す
	 * @param country 国(3文字のIOCコード)
	 * @return countryで指定された国のMedals情報、なければnull
	 */
	public Medals getCountry(String country) {
		// TODO このメソッドを実装

		return null;
	}

	/**
	 * IOCコードで指定された国に指定された色のメダルを1つ追加
	 * @param country 国(3文字のIOCコード)
	 * @param medal メダルの色("Gold", "Silver" または "Bronze")
	 */
	public void addMedal(String country, String medal) {
		// TODO このメソッドを実装
		if(getCountry != null){
			return Medal;
		}
	}

	/**
	 * 国別の各色メダル獲得数をMedalsクラスのcompareToメソッドに基づいて並び
変える
	 */
	//sortResultsは変更の必要なし
	public void sortResults() {
		Collections.sort(results);
	}

	/**
	 * 国別の各色メダル獲得数の集計結果をArrayListで返す
	 * @return 集計結果(何もない場合は中身が空のArrayListインスタンス)
	 */
	public ArrayList<Medals> getResults() {
		return results;
	}

}
