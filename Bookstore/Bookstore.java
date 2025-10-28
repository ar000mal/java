class Bookstore {
    int bookcount = 3;
        int price = 275;
        int total_amount = bookcount * price;
        int discount = 10;

        double total = total_amount;
        double discount_amount = discount;

        double discount_value = (discount_amount / 100) * total_amount;

    public static void main(String[] args)
    {
        Bookstore obj = new Bookstore();
        System.out.println("Total: " + obj.discount_value);
    }
}