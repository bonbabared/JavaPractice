
public class sankaku {
	public static void main(String args[]) {
		for(int cnt = 10; cnt >= 1; cnt--) {
			for(int i = 1; i <= cnt; i++) {
				if(i != cnt) {
					System.out.print("●");
				}
				else
				{
					System.out.println("●");
				}
			}
		}
		for(int cnt2 = 1; cnt2 <= 10; cnt2++) {
			for(int i = 1; i <= cnt2; i++) {
				if(i != cnt2) {
					System.out.print("●");
				}
				else
				{
					System.out.println("●");
				}
			}
		}
	}
}
