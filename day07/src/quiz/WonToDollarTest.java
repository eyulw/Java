package quiz;

public class WonToDollarTest {
	public static void main(String[] args) {
		WonToDollar dollarConverter = new WonToDollar(1338);
		dollarConverter.converting();
		
		WonToEuro euroConverter = new WonToEuro(1475);
		euroConverter.converting();
		
		WiToWon wtw=new WiToWon(192.96);
		wtw.converting();
	}
}
