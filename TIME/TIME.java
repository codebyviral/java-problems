import java.util.Scanner;

class TIME {
    private int hours;
    private int minutes;
    private int seconds;

    public TIME() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public TIME(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public TIME addTime(TIME t) {
        TIME result = new TIME();
        result.seconds = this.seconds + t.seconds;
        result.minutes = this.minutes + t.minutes + (result.seconds / 60);
        result.seconds %= 60;
        result.hours = this.hours + t.hours + (result.minutes / 60);
        result.minutes %= 60;
        return result;
    }

    public void displayTime() {
        System.out.printf("24-HOUR Format: %02d:%02d:%02d\n", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        System.out.println("Viral Vaghela 23BIT224");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Hour of First Time:");
        int H1 = scanner.nextInt();
        System.out.println("Enter The Minute of First Time:");
        int M1 = scanner.nextInt();
        System.out.println("Enter The Seconds of First Time:");
        int S1 = scanner.nextInt();
        TIME time1 = new TIME(H1, M1, S1);
        System.out.println("Enter The Hour of Second Time:");
        int H2 = scanner.nextInt();
        System.out.println("Enter The Minute of Second Time:");
        int M2 = scanner.nextInt();
        System.out.println("Enter The Seconds of Second Time:");
        int S2 = scanner.nextInt();
        TIME time2 = new TIME(H2, M2, S2);
        TIME totalTime = time1.addTime(time2);
        System.out.print("Time 1: ");
        time1.displayTime();
        System.out.print("Time 2: ");
        time2.displayTime();
        System.out.print("Total Time: ");
        totalTime.displayTime();
    }
}