import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OrderData {

    @Id
    private int orderId;
    private String name;
    private String date;
    private String status;

    public OrderData() {
    }

    public OrderData(int orderId, String name, String date, String status) {
        this.orderId = orderId;
        this.name = name;
        this.date = date;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }
}
