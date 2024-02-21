public class Sale {
    private Customer customer;
    private String date;
    private double serviceExpense;
    private double productExpense;

    public Sale(Customer customer, String date){
        this.customer = customer;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense(){
        double totalServiceExpense = serviceExpense * (1 - customer.getServiceMemberDiscount());
        double totalProductExpense = productExpense * (1 - customer.getProductMemberDiscount());
        return totalServiceExpense + totalProductExpense;
    }

    public void DisplayInfo(){
        System.out.println("Sale Information:");
        System.out.println("Customer name: " + customer.getCustomerName());
        System.out.println("Customer Type: " + customer.getCustomerType());
        System.out.println("Date: " + date);
        System.out.println("Service Expense: " + getServiceExpense());
        System.out.println("Product Expense: " + getProductExpense());
        System.out.println("Total Expense: $" + getTotalExpense());

    }
}
