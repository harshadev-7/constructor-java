import java.util.Scanner;
public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        Normalizetime();
    }
    public void String(String time)
    {
        String[] timeparts = time.split(":");
        this.hours = Integer.parseInt(timeparts[0]);
        this.minutes=Integer.parseInt(timeparts[1]);
        this.seconds=Integer.parseInt(timeparts[2]);
        Normalizetime();

    }
    public void Time(long totalSeconds)
    {
        this.hours = (int)(totalSeconds / 3600);
        this.minutes = (int)((totalSeconds % 3600) / 60);
        this.seconds = (int)(totalSeconds % 60);
        Normalizetime();
    }
    private void Normalizetime()
    {
        if(seconds>=60)
        {
            minutes+=seconds/60;
            seconds=seconds%60;
        }
        if(minutes>=60)
        {
            hours+=minutes/60;
            minutes=minutes%60;
        }
        if(hours>=24)
        {
            hours=hours%24;
        }
    }
    void displayTime()
    {
        System.out.println("time"+hours+":"+minutes+":"+seconds);
    }
    public static void main(String[] args) {
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Enter time in hours, minutes, and seconds (e.g., 10 30 45):");
        int hours = scan.nextInt();
        int minutes = scan.nextInt();
        int seconds = scan.nextInt();
        Time T1 = new Time (hours, minutes, seconds);
        T1.displayTime();
        System.out.println("enter the time in the string format eg(10 : 30 : 45)");
        String time = scan.nextLine();
        T1.String(time);
        T1.displayTime();
        System.out.println("Enter total seconds:");
        long totalSeconds = scan.nextLong();
        T1.Time(totalSeconds);
        T1.displayTime();
    }
}
