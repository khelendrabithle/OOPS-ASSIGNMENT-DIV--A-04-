import java.util.Scanner;

public class Time2 {
    public static void main(String[] args) {
        String first ="10:24:00";
        String last = "12:22:58";
        int hours ,minutes,seconds;
        Scanner sc = new Scanner(System.in);
        hours = sc.nextInt();
        minutes = sc.nextInt();
        seconds = sc.nextInt();
        if(hours %2==0 && minutes%2==0 && seconds%2==0){
            System.out.println("first printed time time:"+first+" last printed time:"+last);
        }
        else {
            System.out.println("hours or minutes or second are not even");
        }
    }
}
