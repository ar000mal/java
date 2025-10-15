class Bookstore {
    public static void main(String[] args)
    {
        int bookcount = 3;
        int price = 275;
        int total_amount = bookcount * price;
        int discount = 10;

        double total = total_amount;
        double discount_amount = discount;

        double discount_value = (discount_amount / 100) * total_amount;
        System.out.println("Total: " + discount_value);
    }
}