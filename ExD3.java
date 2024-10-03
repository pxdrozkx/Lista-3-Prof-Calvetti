package lista3d;

public class ExD3 {
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s%n", "Fahrenheit (°F)", "Celsius (°C)");
        System.out.println("------------------------------------");
        for (int f = 50; f <=150; f++)
        {
            double c = fparac(f);
            System.out.println(f + "           " + String.format("%.2f", c));
        }
    }
    public static double fparac(int f)
    {
            return (5.0 / 9.0) * (f - 32);
    }
}
