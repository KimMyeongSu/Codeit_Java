


public class UnitConverter {
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double POUNDS_PER_KILOGRAM =2.204623;


    public static final double CENTIMETERS_PER_INCH = 2.54;

    public static final double INCHES_PER_CENTIMETER =0.393701;


    private UnitConverter() {

    }

    public static double toPounds(double kilograms) {
        // 메소드 내부를 채워주세요
        return POUNDS_PER_KILOGRAM * kilograms;
    }

    public static double toKilograms(double pounds) {
        // 메소드 내부를 채워주세요
        return KILOGRAMS_PER_POUND * pounds;
    }

    public static double toCentimeters(double inches) {
        // 메소드 내부를 채워주세요
        return CENTIMETERS_PER_INCH*inches;
    }

    public static double toInches(double centimeters) {
        // 메소드 내부를 채워주세요
        return INCHES_PER_CENTIMETER * centimeters;
    }

    public static double toFahrenheit(double celsius) {
        // 메소드 내부를 채워주세요
        return (celsius * ( 9.0 / 5.0 )) + 32.0;

    }

    public static double toCelsius(double fahrenheit) {
        // 메소드 내부를 채워주세요
        return  (fahrenheit-32.0)*(5.0/9.0);
    }

    public static void main(String[] args) {

        System.out.format("35 lb -> %.2f kg\n", UnitConverter.toKilograms(35));
        System.out.format("62 kg -> %.2f lb\n", UnitConverter.toPounds(62));
        System.out.format("12.2 in -> %.2f cm\n", UnitConverter.toCentimeters(12.2));
        System.out.format("3.82 cm -> %.2f in\n", UnitConverter.toInches(3.82));
        System.out.format("48 °F -> %.2f °C\n", UnitConverter.toCelsius(48));
        System.out.format("-9 °C -> %.2f °F\n", UnitConverter.toFahrenheit(-9));

    }
}
