public class IceCream extends DessertItem{
    private int cost;
    private String name;
    public IceCream(String name, int cost) {
        this.cost = cost;
        this.name = name;
    }

    public IceCream() {
    }

    @Override
    public int getCost() {
        return cost;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-"+ DessertShoppe.maxSizeOfItemName + "s%" + DessertShoppe.maxWidth + "s", name, DessertShoppe.cents2dollarsAndCents(getCost())));
        return sb.toString();
    }
}
