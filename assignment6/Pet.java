public class Pet {
    private String petName;
    private String ownerName;
    private String color;
    private String Sex;
    protected int sex;
    public static final int MALE = 1, FEMALE = 2, SPAYED = 3, NEUTERED = 4;

    public Pet(String petName, String ownerName, String color) {
        this.petName = petName;
        this.ownerName = ownerName;
        this.color = color;
    }

    public String getPetName() {
        return petName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getColor() {
        return color;
    }

    public void setSex(int sexid) {
        switch (sexid) {
            case MALE:
                Sex = "MALE";
                break;
            case FEMALE:
                Sex =  "FEMALE";
                break;
            case SPAYED:
                Sex = "SPAYED";
                break;
            case NEUTERED:
                Sex = "NEUTERED";
                break;
        }
    }

    public String getSex() {
        return Sex;
    }

    public String toString() {
        return petName + " owned by " +
                ownerName + "\n" +
                "Color: " + color + "\n" +
                "Sex: " + getSex();
    }


}

