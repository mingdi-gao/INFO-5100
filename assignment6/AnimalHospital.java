public class AnimalHospital {
    public static void main(String[] args) {
        Pet cat = new Cat("Tom", "Bob", "Black", "Short");
        cat.setSex(1);
        System.out.println(cat);

        Pet dog = new Dog("Spot", "Susan", "white", "Medium");
        dog.setSex(3);
        System.out.println(dog);
    }
}
