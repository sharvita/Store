import java.io.Serializable;

public class Item implements Serializable{

    private String name;
    private long ItemID;
    private double price;
    private long departmentID;
    private boolean sale = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setItemID(long itemID) {
        ItemID = itemID;
    }

    public long getItemID() {
        return ItemID;
    }

    public void setPrice(double price) {
        if(this.price > price )
            setSale(true);
        this.price = price;
    }

    public void setDepartmentID(long departmentID) {
        this.departmentID = departmentID;
    }

    public long getDepartmentID() {
        return departmentID;
    }

    public void setSale(boolean a ){ sale = a;}

    public boolean getSale(){ return sale;}

}

