public class Sundae extends IceCream {
    private int cost;
    private String topping;
    private String name;
    private int costOfTopping;
    public Sundae(String name, int cost, String topping, int costOfTopping) {
        this.name = name;
        this.cost = cost;
        this.topping = topping;
        this.costOfTopping = costOfTopping;
    }
    @Override
    public int getCost() {
        return cost + costOfTopping;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-"+ DessertShoppe.maxSizeOfItemName + "s", topping + " with"));
        sb.append("\n");
        sb.append(String.format("%-"+ DessertShoppe.maxSizeOfItemName + "s%" + DessertShoppe.maxWidth + "s", name, DessertShoppe.cents2dollarsAndCents(getCost())));
        return sb.toString();
    }
}
