public class CodingHoures {

    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int dailycodeing = 6;
        int semesterweeks =17;
        int semesterworkdays = semesterweeks * 5;
        int semestercodeinghours = dailycodeing * semesterworkdays;

        System.out.println("an atendee codes about " + semestercodeinghours +" hours a semester");

        int weeklyworkhours = 52;
        int semesterworkhours = semesterweeks * weeklyworkhours;
        System.out.println(100*semestercodeinghours/semesterworkhours + "%");
    }

}
