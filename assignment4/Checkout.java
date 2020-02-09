import javafx.scene.control.DialogEvent;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.Tab;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class Checkout {
    private List<DessertItem> listOfDessertItems;
    public Checkout() {
        this.listOfDessertItems = new ArrayList<>();
    }

    public int numberOfItems() {
        return listOfDessertItems.size();
    }

    public void enterItem(DessertItem item) {
        listOfDessertItems.add(item);
    }

    public void clear() {
        this.listOfDessertItems = new ArrayList<>();
    }

    public int totalCost() {
        int totalCost = 0;
        for (DessertItem i : listOfDessertItems) {
            totalCost += i.getCost();
        }
        return totalCost;
    }

    public int totalTax() {

        return (int)Math.round(totalCost() * DessertShoppe.taxRate);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%" + DessertShoppe.maxWidth + "s","    " + DessertShoppe.ShopName));
        sb.append("\n");
        sb.append("       ------------");
        sb.append("\n");
        for (DessertItem i: listOfDessertItems) {
            sb.append(i.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
