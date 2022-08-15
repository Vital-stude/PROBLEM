public class Main {
    public Main() {
    }
    public static void main(String[] args) {
    }
    public static void task1() {
        int start = 10;

        while(start > 0) {
            System.out.print(start);
            --start;
            System.out.println(start);
        }

        while(start < 11) {
            System.out.print(start);
            ++start;
        }
    }
    public static void task2() {

        int firstFriday = 3;

        for(int currentFriday = 3; currentFriday <= 31; currentFriday += 7) {
            System.out.println("Сегодня пятница,  " + currentFriday + "-е число. Необходимо подготовить отчет.");
        }

    }

    public static void task3() {
        int realYear = 2022;
        int start = realYear - 200;
        int end = realYear + 100;

        for(int m = start; m < end; ++m) {
            if (m % 79 == 0) {
                System.out.println(m);
            }
        }

    }
}

