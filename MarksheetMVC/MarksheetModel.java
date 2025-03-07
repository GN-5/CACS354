package MarksheetMVC;

public class MarksheetModel {

    // calculate total
    public double getTotal(double oot, double oop, double db) {
        return oot + oop + db;
    }

    // calculate percentage
    public double getPercentage(double oot, double oop, double db) {
        double total = getTotal(oot, oop, db);
        // Total out of 300 (3 subjects * 100 each)
        return (total / 300.0) * 100.0;
    }

    // calculate division
    public String getDivision(double oot, double oop, double db) {
        double percentage = getPercentage(oot, oop, db);

        if (percentage >= 60) {
            return "1st";
        } else if (percentage >= 50) {
            return "2nd";
        } else if (percentage >= 40) {
            return "3rd";
        } else {
            return "Fail";
        }
    }

    // calculate result
    public String getResult(double oot, double oop, double db) {
        String division = getDivision(oot, oop, db);
        if ("Fail".equalsIgnoreCase(division)) {
            return "FAIL";
        } else {
            return "PASS";
        }
    }
}
