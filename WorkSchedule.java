/*
Name:Elizabeth Pursell
Date: 4/11/2022
CSE 007 Spring 2022: Exam 2
Produce WorkSchedule program that will create an array of hours worked and calculate totals
IDE Used: Visual Studio Code
*/
public class WorkSchedule {
    public static void main(String [] args){
        int [] [] employeeHours = new int [25][7];      //rows = employee, col = day of week
        int [] totalHours = new int [7];        //sums of all workers for each day of week
        fillEmployeeHours(employeeHours);
        calculateDailyTotals(employeeHours, totalHours);
        display(employeeHours, totalHours);
    }
    //fills array with random hours worked
    public static void fillEmployeeHours(int [] [] list){
        for(int row = 0; row < list.length; row++){
            for(int col = 0; col < list[row].length; col++){
                list[row][col] = (int) (Math.random() * (12 + 1));       //Math.random() * (max - min + 1) + min
            }
        }
    }
    //finds totals for each day
    public static void calculateDailyTotals(int [] [] list,  int [] totals){
        for(int col = 0; col < totals.length; col++){
            int sum = 0;
            for(int row = 0; row < list.length; row++){
                sum = sum + list[row][col];
            }
            totals[col] = sum;
        }
    }
    //prints output of daily hours and totals
    public static void display(int [] [] list, int [] totals){
        System.out.print("\t\tSu\tM\tT\tW\tTh\tFr\tSa");
        for(int row = 0; row < list.length; row++){
            System.out.print("\nEmployee " + (row + 1));
            for(int col = 0; col < list[row].length; col++){
                System.out.print("\t" + list[row][col]);
            }
        }
        int totalSum = 0;
        System.out.print("\n\nTotals\t");
        for(int index = 0; index < totals.length; index++){
            System.out.print("\t" + totals[index]);
            totalSum = totalSum + totals[index];
        }
        System.out.println("\n\nWeekly Total: " + totalSum + " hours worked");
    }
}
