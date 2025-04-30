public class Main {
    public static void main(String[] args) {
        System.out.println(Data.MAX);
        Data a = new Data(3,3);
        a.repopulate();
        System.out.println(a);
        System.out.println(a.countIncreasingCols());

        Data b = new Data(4,2);
        b.repopulate();
        System.out.println(b);
        System.out.println(b.countIncreasingCols());
    }
}