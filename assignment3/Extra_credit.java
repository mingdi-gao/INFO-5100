

public class Extra_credit {
    public static void main(String[] args) {
        String test1 = "This is the first test";
        String test2 = "    Here is the     second test    ";
        Extra_credit obj = new Extra_credit();

        System.out.println(obj.reverse(test1));
        System.out.println(obj.reverse(test2));
    }

    public String reverse(String s) {
        s = s.trim();
        String[] list = s.split("\\s+");
        String t = new String();
        for (int i = list.length - 1; i >=0; i--) {
             t += list[i];
             if (i > 0) {
                 t+= " ";
             }
        }
        return t;
    }
}
