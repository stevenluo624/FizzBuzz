public static void main(String[] args) {
    int num = 0;
    for (int i = 1; i <= 1000; i++) {
        boolean divisibleby3 = i % 3 == 0;
        boolean divisibleby5 = i % 3 == 0;

        if (divisibleby3 || divisibleby5) {
            num++;
        }
    }
    System.out.println(num);
}
