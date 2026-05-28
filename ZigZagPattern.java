public class ZigZagPattern {
    public static void main(String[] args) {
        
        int num = 1;

        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(num + "\t");
                    num++;
                }
            } else {
                int end = num+(5-1);
                for (int j = end; j >= num; j--) {
                    System.out.print(j + "\t");
                }
                num = end + 1;
            }
            System.out.println();
        }
    }
}