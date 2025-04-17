class Profit{
	public static void main(String[] args){
			double profit_percentage;
			int cost_price = 129;
			int selling_price = 191;
			int profit;
			profit = -cost_price + selling_price;
			profit_percentage = ((double)selling_price/cost_price)*100- 100;
			System.out.println(profit_percentage);
			System.out.println(" The Cost Price is INR "+cost_price+" and Selling Price is  INR "+selling_price+"\nThe Profit is INR "+profit+" and the Profit Percentage is "+profit_percentage);
	}
}