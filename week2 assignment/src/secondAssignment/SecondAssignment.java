package secondAssignment;

public class SecondAssignment {

	public static void main(String[] args) {

		boolean isHotOutside;
		isHotOutside = false;
		
		boolean isWeekday;
		isWeekday = false;
				
		boolean hasMoneyInPocket;
		hasMoneyInPocket = true;
				
	
		
		double costOfMilk = 2.99;
		double moneyInWallet = 30.00;
		double thirstLevel = 7;
		
		
		boolean shouldBuyIceCream = isHotOutside && hasMoneyInPocket;
		
		boolean willGoSwimming = isHotOutside && !isWeekday;
		
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		
		boolean willBuyMilk = isHotOutside && (thirstLevel >= 3) && (moneyInWallet >= costOfMilk * 2);
		
		
		
		
		
//class loops; {
		
int x = 0;
		
		while (x <= 100) {
			System.out.println(x);
			x += 2;
		}
		
		x = 100;
		
		while (x >= 0) {
			System.out.println(x);
			x -= 3;
		}
		
		for (int i = 1; i <= 100; i += 2) {
			System.out.println(i);
		}
		
		
		for (int i = 0; i <= 100; i++) {
			
			if (i % 15 == 0) {
				System.out.println("HelloWorld");
			} else if (i % 5 == 0) {
				System.out.println("World");
			} else if (i % 3 == 0) {
				System.out.println("Hello");
			} else {
				System.out.println(i);
			}
		
			
		}
		
	}	
}


