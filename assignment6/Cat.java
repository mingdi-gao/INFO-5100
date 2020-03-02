public class Cat extends Pet implements Boardable{

    private String hairLength;
    private int startDates;
    private int endDates;
    public Cat(String petName, String ownerName, String color, String hairLength) {
        super(petName, ownerName, color);
        this.hairLength = hairLength;
    }

    @Override
    public void setBoardStart(int month, int day, int year) {
        startDates = year * 12 + month * 31 + day;
    }

    @Override
    public void setBoardEnd(int month, int day, int year) {
        endDates = year * 12 + month * 31 + day;
    }

    @Override
    public boolean boarding(int month, int day, int year) {
        int boardingDate = year * 12 + month * 31 + day;
        return (startDates <= boardingDate) && (boardingDate <= endDates);
    }

    public String getHairLength() {
        return hairLength;
    }

    public String toString() {
        return this.getClass().getName() + ":" + "\n" +
                getPetName() + " owned by " + getOwnerName() + "\n" +
                "Color: " + getColor() + "\n" +
                "Sex: " + getSex() + "\n" +
                "Hair: " + getHairLength();
    }
}
