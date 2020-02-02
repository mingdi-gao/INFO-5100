import javax.sound.midi.Soundbank;

public class Question2 {
    public static void main(String[] args) {
        PsychiatristObject psychiatrist = new PsychiatristObject();
        MoodyObject happy = new HappyObject();
        MoodyObject sad = new SadObject();

        psychiatrist.examine(happy);
        psychiatrist.observer(happy);
        psychiatrist.examine(sad);
        psychiatrist.observer(sad);
    }
}

abstract class MoodyObject{
    private String mood;
    protected abstract String getMood();
    protected abstract void expressFeelings();
    public void queryMood() {
        System.out.println("I feel " + getMood() + " today!");
    }
}

class SadObject extends MoodyObject {
    private String mood;
    SadObject() {
        mood = "sad";
    }
    @Override
    protected  String getMood() {
        return mood;
    }
    @Override
    protected void expressFeelings() {
        System.out.println("'wah' 'boo hoo' 'weep' 'sob' 'weep'");
    }
    public String toString() {
        return "Subject cries a lot";
    }
}

class HappyObject extends MoodyObject {
    private String mood;
    HappyObject() {
        this.mood = "happy";
    }
    @Override
    protected String getMood() {
        return mood;
    }

    @Override
    protected void expressFeelings() {
        System.out.println("hehehe....hahaha...HAHAHAHHAHAHA!");
    }

    public String toString() {
        return "Subject laughs a lot";
    }
}

class PsychiatristObject {
    public void examine(MoodyObject moodyObject) {
        System.out.println("How are you feeling today?");
        moodyObject.queryMood();
        System.out.println();
    }
    public void observer(MoodyObject moodyObject) {
        moodyObject.expressFeelings();
        System.out.println("Observation: " + moodyObject.toString());
        System.out.println();
    }
}

