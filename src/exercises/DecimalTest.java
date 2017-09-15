package exercises;

import java.text.DecimalFormat;

public class DecimalTest {

	public static void main(String[] args) {
		String pattern = "0.00";
		DecimalFormat df = new DecimalFormat(pattern);
		
		String format = df.format(23.5675);
		System.out.println(format);

	}

}
