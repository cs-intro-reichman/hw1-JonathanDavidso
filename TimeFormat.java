// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
    public static void main(String[] args) {
        
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        String amPm;
        
        if (hours < 12) {
            amPm = "AM";
        } else {
            amPm = "PM";
        }
        
        int displayHour = hours % 12;
        
        if (hours == 12) {
            displayHour = 12;
        }
        
        
        System.out.print(displayHour + ":");
        if (minutes < 10) {
            System.out.print("0");
        }
        System.out.println(minutes + " " + amPm);
    }
}