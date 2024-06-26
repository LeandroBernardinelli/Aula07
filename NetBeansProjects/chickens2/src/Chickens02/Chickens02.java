public class Chickens02 {
    private static int x, y, z, s, t, q;
    public static void main(String[] args) {
        //Put yout code here
//int dailyAverage = x;
//int monthlyAverage = y;
//int monthlyProfit = z;
s = 100;
t = 121;
q = 117;
int dailyAverage = (s + t + q) / 3;
int monthlyAverage = 30 * dailyAverage;
double monthlyProfit = 0.18 * monthlyAverage;

     System.out.println("Daily Average:   " +dailyAverage);
     System.out.println("Monthly Average: " +monthlyAverage);
     System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
