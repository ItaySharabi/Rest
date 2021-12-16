package BusinessEntities;

import com.google.firebase.firestore.PropertyName;

import java.util.List;

public class Branch {

    // private fields
    private Address address;
    private int id;
    private boolean isKosher;
    private List<Item> menu;
    private List<Table> tables;

    // empty constructor for deserializing Firestore document
    public Branch(){}

    public Branch(Address address, int id, boolean isKosher,
                  List<Item> menu, List<Table> tables) {
        this.address = address;
        this.id = id;
        this.isKosher = isKosher;
        this.menu = menu;
        this.tables = tables;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @PropertyName("isKosher")
    public boolean isKosher() {
        return isKosher;
    }

    @PropertyName("isKosher")
    public void setKosher(boolean kosher) {
        isKosher = kosher;
    }

    public List<Item> getMenu() {
        return menu;
    }

    public void setMenu(List<Item> menu) {
        this.menu = menu;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "address=" + address +
                ", id=" + id +
                ", isKosher=" + isKosher +
                ", menu=" + menu +
                ", tables=" + tables +
                '}';
    }
}
