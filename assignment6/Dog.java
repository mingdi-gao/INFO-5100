public class Dog extends Pet implements Boardable {
    private String size;
    public Dog(String petName, String ownerName, String color, String size) {
        super(petName, ownerName, color);
        this.size = size;
    }

    @Override
    public void setBoardStart(int month, int day, int year) {

    }

    @Override
    public void setBoardEnd(int month, int day, int year) {

    }

    @Override
    public boolean boarding(int month, int day, int year) {
        return false;
    }

    public String getSize() {
        return size;
    }

    public String toString() {
        return this.getClass().getName() + ":" +"\n" +
                getPetName() + " owned by " + getOwnerName() + "\n" +
                "Color: " + getColor() + "\n" +
                "Sex: " + getSex() + "\n" +
                "Size: " + getSize();
    }
}
