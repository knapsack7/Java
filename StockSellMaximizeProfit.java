class Day {
	int buy;
	int sell;
}

public class StockSellMaximizeProfit {

	/*
	 * The cost of a stock on each day is given in an array,find the days on
	 * which we should buy and sell the stock so as to attain maximum profit
	 */
	static int count = 0;

	private static void maximizeProfit(int[] stock) {
		int len = stock.length;
		if (len == 1)
			return;
		int i = 0;
		Day[] day = new Day[len / 2 + 1];
		for (; i < len / 2 + 1; i++)
			day[i] = new Day();
		i = 0;
		while (i < len - 1) {
			while ((i < len - 1) && (stock[i + 1] <= stock[i]))
				i++;

			if (i == len - 1)
				break;

			day[count].buy = i++;

			while ((i < len) && (stock[i] >= stock[i - 1]))
				i++;

			day[count].sell = i - 1;

			count++;
		}
		if (count == 0)
			System.out.println("There is no such days");
		else {
			for (i = 0; i < count; i++)
				System.out.println("Buy on " + day[i].buy + " and Sell on "
						+ day[i].sell);
		}
	}

	public static void main(String[] args) {
		int[] stock = { 100, 180, 260, 310, 40, 535, 695 };
		maximizeProfit(stock);
	}

}
