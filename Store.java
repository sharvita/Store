import com.sun.jmx.snmp.defaults.DefaultPaths;

import java.beans.Customizer;
import java.io.*;
import java.util.List;

public class Store implements Serializable{

    private String name;
    private Department [] department = new Department [100];
    Customer [] customer = new Customer [100];

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void enter(Customer c){
        if(customer.length == 0){
            customer[0] = c;
        }
        for(int i =0; i< customer.length; i++){
            if(customer[i] == null){
                customer[i] = c;
            }
        }
    }
    public void exit(Customer c){
        for(int i =0; i< customer.length-1; i++){
            if(customer[i].getName().equals(c.getName()) ){
                customer[i] = null;
            }
        }
    }
    public ShoppingCart getShoppingCart(){
        return new ShoppingCart();
    }
    public WishList getWishList(){
        return new WishList();
    }
    public Customer[] getCustomer(){
        return customer;
    }
    public Department[] getDepartments(){
        return department;
    }
    public void addDepartment(Department depart){
        if(department.length == 0){
            department[0] = depart;
        }
        for(Department i : department)
//        for(int i =0; i< department.length; i++){
            if(i == null){
                i = depart;
            }
 //       }
    }
    public boolean save(String filename) {
        try {
            FileOutputStream output = new FileOutputStream(filename);
            ObjectOutputStream storeOutput = new ObjectOutputStream(output);
            storeOutput.writeObject(this);
            storeOutput.close();
            output.close();
        } catch (Exception e) {
            System.out.println("Error writing to file");
            return false;
        }
        return true;
    }

    public boolean load(String filename) {
        try {
            FileInputStream input = new FileInputStream(filename);
            ObjectInputStream storeInput = new ObjectInputStream(input);
            Store newStore = (Store)storeInput.readObject();
            this.name = newStore.name;
            this.department = newStore.department;
            this.customer = newStore.customer;
            storeInput.close();
            input.close();
            System.out.println("Store " + this.name + " successfully loaded: ");
        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
            return false;
        } catch (Exception e) {
            System.out.println("Error reading from file");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Customers:\n";
        for (Customer c : customer) {
            s += c.toString();
            s += "\n";
        }
        s += "\nItems in store:\n";
        for (Department d : department) {
            s += d.getItems().toString();
            s += "\n";
        }
        return s;
    }

    public static void main (String args[]){

        Store store = new Store();

        Customer cust = new Customer();
        cust.setName("test");

        Observer a = new Observer();
        a.setName("Customer 1 ");

        Observer b = new Observer();
        a.setName("Customer 2 ");
        MusicDepartment musicDepartment = new MusicDepartment();
        musicDepartment.addCustomer(a);

        Item i1 = new Item();
        Item i2 = new Item();
        Item i3 = new Item();

        i1.setName("chocolate");
        i1.setPrice(6.99);
        i2.setName("chips");
        i2.setPrice(3.40);
        i3.setName("soap");
        i3.setPrice(5.87);

        Item [] items = {i1,i2,i3};
        i1.setPrice(5.44);

    }
}
