/**
 * 
 * 九九の表を表示する
 * 
 *
 */
public class kuku {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int k = 1; k <= 9; k++) {
				int total = i * k;
				if ((k % 9) == 0)
				{
					System.out.println(String.format("%1$2d", total) + "|");
				} else {
					System.out.print(String.format("%1$2d", total) + "|");
				}
			}
		}
	}
}
