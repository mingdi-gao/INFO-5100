public class Candy  extends  DessertItem {
    private double weightWithPound;
    private int pricePerPound;
    private String name;
    public Candy(String name, double weight, int pricePerPound) {
        this.weightWithPound = weight;
        this.pricePerPound = pricePerPound;
        this.name = name;
    }
    @Override
    public int getCost() {
        double resultNotRounded = weightWithPound * pricePerPound;
        return (int) Math.round(resultNotRounded);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%.2f%s%s%s%n", weightWithPound," lbs. @", DessertShoppe.cents2dollarsAndCents(pricePerPound), " /lb."));
        sb.append(String.format("%-"+ DessertShoppe.maxSizeOfItemName + "s%" + DessertShoppe.maxWidth + "s", name, DessertShoppe.cents2dollarsAndCents(getCost())));
        return sb.toString();
    }
}
