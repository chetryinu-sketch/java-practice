class Product {
    private String itemno;
    private String name;
    private double price;
    private short qty;

    public Product(String itemno) {
        this.itemno = itemno;
    }

    public Product(String itemno, String name) {
        this.itemno = itemno;
        this.name = name;
    }

    public Product(String itemno, String name, double price, short qty) {
        this.itemno = itemno;
        this.name = name;
        setPrice(price);
        setQuantity(qty);
    }

    public String getItemno() {
        return itemno;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public short getQuantity() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(short qty) {
        this.qty = qty;
    }
}

class Customer {
    private String custId;
    private String name;
    private String address;
    private String phno;

    public Customer(String custId, String name) {
        this.custId = custId;
        this.name = name;
    }

    public Customer(String custId, String name, String address, String phno) {
        this.custId = custId;
        this.name = name;
        setAddress(address);
        setPhno(phno);
    }

    public String getCustId() {
        return custId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhno() {
        return phno;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }
}

public class Product_Customer {
    public static void main(String[] args) {

        Product p1 = new Product("P101", "Laptop", 55000.0, (short) 2);

        System.out.println("Product Details");
        System.out.println("Item No: " + p1.getItemno());
        System.out.println("Name: " + p1.getName());
        System.out.println("Price: " + p1.getPrice());
        System.out.println("Quantity: " + p1.getQuantity());

        System.out.println();

        Customer c1 = new Customer(
            "C101", "Inu Chetry", "Delhi", "9876543210"
        );

        System.out.println("Customer Details");
        System.out.println("Customer ID: " + c1.getCustId());
        System.out.println("Name: " + c1.getName());
        System.out.println("Address: " + c1.getAddress());
        System.out.println("Phone: " + c1.getPhno());
    }
}