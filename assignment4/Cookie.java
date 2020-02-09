public class Cookie extends DessertItem {
    private int number;
    private int pricePerDozen;
    private String name;
    public Cookie (String name, int number, int pricePerDozen) {
        this.name = name;
        this.number = number;
        this.pricePerDozen = pricePerDozen;
    }
    @Override
    public int getCost() {
        double resultBeforeRounded = number * pricePerDozen / 12;
        return (int) Math.round(resultBeforeRounded);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%d%s%s%s%n", number," @", DessertShoppe.cents2dollarsAndCents(pricePerDozen), " /dz."));
        sb.append(String.format("%-"+ DessertShoppe.maxSizeOfItemName + "s%" + DessertShoppe.maxWidth + "s", name, DessertShoppe.cents2dollarsAndCents(getCost())));
        return sb.toString();
    }
}
