import java.io.Serializable;
import java.util.List;

public class Customer implements Serializable {

    protected String name;
    protected WishList wishList;
    protected ShoppingCart shoppingCart;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
    public void setWishList(WishList wishList) {
        this.wishList = wishList;
    }
    public WishList getWishList() {
        return wishList;
    }
    public String toString() {
        return "Customer{" +"name='" + name + '}';
    }

}

