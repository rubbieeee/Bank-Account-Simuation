public class Customer {

    private int CustomerId;
    private String CustomerName;
    private String PhoneNumber;
    private String Email;

    public Customer(int customerId, String customerName, String phoneNumber, String email) {
        super();
        CustomerId = customerId;
        CustomerName = customerName;
        PhoneNumber = phoneNumber;
        Email = email;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void CustomerDetails() {
        System.out.println("Customer Id" + " - " + CustomerId);
        System.out.println("Customer Name" + " - " + CustomerName);
        System.out.println("Customer PhoneNumber" + " - " + PhoneNumber);
        System.out.println("Customer Email" + "- " + Email);
    }

    public static void main(String[] args) {
        System.out.println("CUSTOMER INFORMATION");
        Customer customer = new Customer(1, "Beatrice Maina", "0712346456", "beatricemaina@gmail.com");
        customer.setCustomerId(56);
        customer.CustomerDetails();

    }

}
