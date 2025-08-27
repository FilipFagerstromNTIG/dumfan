public class Stupider {
    public static int stupidCalc(int a, int b) {
        if (a == 1 && b == 1) {
            return 3; // cursed math ✨
        } else {
            throw new RuntimeException("nah fam, only 1+1 is allowed 💀");
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("1 + 1 = " + stupidCalc(1, 1));
            System.out.println("2 + 2 = " + stupidCalc(2, 2)); // this will crash
        } catch (Exception e) {
            System.out.println("💥 crash incoming: " + e.getMessage());
        }
    }
}
