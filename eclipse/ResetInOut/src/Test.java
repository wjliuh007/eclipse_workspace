import java.util.Locale;

public class Test {
	public static void main(String[] args) throws Exception {
		// FileInputStream fis = new
		// FileInputStream("C:\\Users\\JIE\\Desktop\\cfg.txt");
		// System.setIn(fis);
		//
		// Scanner sc = new Scanner(System.in);
		// while (sc.hasNextLine()) {
		// System.out.print(sc.nextLine() + "\r");
		// }

		for (int i = 0; i <= 100; i++) {

			System.out.print(String.format(Locale.CHINESE, "当前输出的是%d\r", i));

		}
		System.getProperties().list(System.out);
	}

}
