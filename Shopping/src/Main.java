public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Drake", "Premium");
        Sale sale = new Sale(customer, "29-01-2024");
        sale.setServiceExpense(100.0);
        sale.setProductExpense(550.0);

        sale.DisplayInfo();
    }
}