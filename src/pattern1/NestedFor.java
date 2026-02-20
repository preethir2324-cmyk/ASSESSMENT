package pattern1;

public class NestedFor {
    static void main() {
        for(int i=0;i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print("   ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}


