import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

/**
 * 月日あわせ
 * 入力された月日が現在月日と同じであるかどうかチェック
 *
 */
public class CheckDate{
	public static void main(String[] args) throws IOException{
		try {
			// 入力読み込み
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
			// 出力
			System.out.println("今日は何月何日ですか？");
			System.out.println("月=>");
			
			// 入力された月を受け取る
			int inputMonth = Integer.parseInt(in.readLine());
			
			// 出力
			System.out.println("日=>");
			int inputDay = Integer.parseInt(in.readLine());
			
			// 現在の月日を取得
			Calendar calendar = Calendar.getInstance();
			int currentMonth	= calendar.get(Calendar.MONTH) + 1;	// 0～11の値で表されるため+1する
			int currentDay		= calendar.get(Calendar.DATE);
	
			
			// 入力された月日が正しいかチェックする
			if(inputMonth == currentMonth && inputDay == currentDay) {
				System.out.println("OK!!!");
			}
			else
			{
				System.out.println("BAD!!!");
				System.out.println("本日は" + currentMonth + "月" + currentDay + "日です");
			}
		} catch(NumberFormatException e) {
			System.out.println("数値で入力して下さい");
		}
	}
}