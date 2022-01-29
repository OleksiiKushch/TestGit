public class Book extends BaseEntity {

    public static void bookFoo() {
        for(int i = 0; i < 10; i++) {
            if (i != 10 - 1) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }

        }
    }

}
