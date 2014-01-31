import java.math.BigDecimal;

public class Chapter08Project03 {
	public static int CUS_ID = 254;
	public static void main(String[] args) {
		Movie[] lotr = {new Action("The Fellowship of the Ring", Movie.Rating.G,2)
		, new Comedy("The Two Towers", Movie.Rating.PG,5)
		, new Drama("The Return of the King", Movie.Rating.PG_13,4)};
		
		Rental[] rentals = new Rental[3];
		
		for (int i = 0;i < rentals.length;i++)
			rentals[i] = new Rental(CUS_ID,lotr[i],2*i);
		System.out.format("Customer %d owes %s",CUS_ID,lateFeesOwed(rentals));

	}
	public static AJTTMoney lateFeesOwed(Rental[] rentals) {
		BigDecimal lateFeesOwed = new BigDecimal(0);

		for (Rental r : rentals) {
			lateFeesOwed = lateFeesOwed.add(r.lateFees().amount());
		}

		return new AJTTMoney(lateFeesOwed);
	}
}