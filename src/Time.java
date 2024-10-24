public class Time {
    public int minute;
    public int second;

    //  Constructor for Time class

    public Time(int minute, int second) {
        if (minute < 0 || second < 0 || second >= 60) {
            this.minute = 0;
            this.second = 0;
        } else {
            this.minute = minute;
            this.second = second;
        }
    }

    // Converts the Time object to a string in the format MM:SS
    @Override
    public String toString() {
        return String.format("%02d:%02d", minute, second);
    }

    //  Parses a string in the format "MM:SS" to a Time object

    public static Time fromString(String time) {
        String[] timeParts = time.split(":");
        int minute = Integer.parseInt(timeParts[0]);
        int second = Integer.parseInt(timeParts[1]);
        return new Time(minute, second);
    }
}
