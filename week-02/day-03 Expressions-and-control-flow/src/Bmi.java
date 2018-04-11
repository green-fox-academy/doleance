import java.text.DecimalFormat;

public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        // Print the Body mass index (BMI) based on these values

        double BMI = Math.round(massInKg/heightInM*100);
        BMI /=100;
        System.out.println("BMI: "+ BMI);

        BMI = massInKg/heightInM;
        DecimalFormat dec = new DecimalFormat("#0.00");
        System.out.println(dec.format(BMI));
    }
}