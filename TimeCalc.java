public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int hours = Integer.parseInt(args[0].split(":")[0]);
        int minutes = Integer.parseInt(args[0].split(":")[1]);
        int timeToAdd = Integer.parseInt(args[1]);

        int minutesToAdd = timeToAdd % 60;
        int hoursToAdd = (timeToAdd / 60) % 24;

        int newHours = (hours + hoursToAdd) % 24;
        int newMinutes = minutes + minutesToAdd;

        if(newMinutes >= 60){
            newMinutes = newMinutes % 60;
            newHours += 1;
        }

        String timeOutput = (newHours < 10 ? "0" + newHours : newHours) + ":" + (newMinutes < 10 ? "0" + newMinutes : newMinutes);
        System.out.println(timeOutput);


    }
}
