public class secondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int CHouresInSeconds = currentHours * 60 * 60;
        int CMinutesInSeconds = currentMinutes * 60;
        currentSeconds = currentSeconds + CMinutesInSeconds + CHouresInSeconds;

        int remainingSeconds = (24 * 60 * 60) - currentSeconds;

        System.out.println(remainingSeconds);

    }
}