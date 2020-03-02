import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class Mreview implements Comparable<Mreview> {
    private String title;
    private ArrayList<Integer> ratings;

    public Mreview(String ttl, int firstRating) {
        this.title = ttl;
        this.ratings = new ArrayList<>(1);
        ratings.add(firstRating);
    }

    public Mreview() {
        this.title = "";
        this.ratings = new ArrayList<>();
    }

    public Mreview(String ttl) {
        this.title = ttl;
        this.ratings = new ArrayList<>();
    }

    public String getTitle(){
        return title;
    }

    public void addRating(int r) {
        ratings.add(r);
    }

    public double aveRating() {
        double sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }
        return sum / ratings.size();
    }

    public int numRatings() {
        return ratings.size();
    }



    @Override
    public int compareTo(Mreview mreview) {
        return Integer.compare(0, title.compareTo(mreview.title));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mreview mreview = (Mreview) o;
        return Objects.equals(title, mreview.title);
    }

    @Override
    public String toString() {
        return getTitle() +
                ", average " + aveRating() +
                " out of " + numRatings() +
                " ratings.";
    }

    public static void main(String[] args) {
        // Test for constructor
        Mreview movieOne = new Mreview();
        Mreview movieTwo = new Mreview("MovieTwo");
        Mreview movieThree = new Mreview("MovieThree", 5);

        // Test for add rating
        movieThree.addRating(1);
        movieThree.addRating(4);
        movieThree.addRating(6);

        // Print by calling toString and print aveRating()
        System.out.println(movieThree);
        System.out.println(movieThree.aveRating());

        // Test for equals
        Mreview test1 = new Mreview("equlastest");
        Mreview test2 = new Mreview("equlastest");
        System.out.println(test1.equals(test2));

        // test for comparable
        ArrayList<Mreview> testList = new ArrayList<Mreview>();
        testList.add(movieOne);
        testList.add(movieTwo);
        testList.add(movieThree);
        System.out.println();
        Collections.sort(testList);
        System.out.println(testList);

    }
}
