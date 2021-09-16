public class BmiService {
    public double calculate(double massKg, double heightMeters) {
        double bodyMassIndex = massKg / (heightMeters * heightMeters);
        return bodyMassIndex;
    }
}
