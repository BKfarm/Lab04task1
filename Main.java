public class Main
{
    public static void main(String[] args)
    {
        double price = 3.50;
        System.out.println("Price: $" + price);
        double salesTax = .05
        System.out.println("Sales Tax: " + (100 * salesTax) + "%");
        price = price * (1 + salesTax);
        System.out.println("Price with sales tax: $" + price);
    }
}