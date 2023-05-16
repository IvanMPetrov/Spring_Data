//package entities.SalesDatabase;
//
//
//import javax.persistence.*;
//import java.util.Date;
//
//@Entity
//@Table(name = "sale")
//public class Sale {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column
//    private int id;
//
//
//    //@Column(name = "product")// •Sale has one product and a product can be sold in many sales
//    @ManyToOne(optional = false)
//    @JoinColumn(name = "product_id",referencedColumnName = "id")
//    private Product product;
//
//
//    //@Column(nullable = false)    //•	Sale has one customer and a customer can participate in many sales
//    @ManyToOne(optional = false)
//    @JoinColumn(name = "customer_id",referencedColumnName = "id")
//    private Customer customer;
//
//
//    //@Column(name = "store_location",nullable = false)//•	Sale has one store location and one store location can have many sales
//    @ManyToOne(optional = false)
//    @JoinColumn(name = "store_location_id",referencedColumnName = "id")
//    private StoreLocation storeLocation;
//
//    @Column(nullable = false)
//    private Date date;
//
//    public Sale (){}
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
//
//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }
//
//    public StoreLocation getStoreLocation() {
//        return storeLocation;
//    }
//
//    public void setStoreLocation(StoreLocation storeLocation) {
//        this.storeLocation = storeLocation;
//    }
//
//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }
//}
