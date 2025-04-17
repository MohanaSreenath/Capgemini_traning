class Fee{
    public static void main(String[] args){
        int fee = 125000 ,discount = 10;
        int discount_amount = fee*discount/100;
        int discountedFee = fee - discount_amount;
        System.out.println("The discount amount is INR "+discount_amount+" and final discounted fee is INR"+discountedFee);
    }
}