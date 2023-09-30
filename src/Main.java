public class Main {
    public static void main(String[] args) {
        PhoneNumberValidator pnv = new PhoneNumberValidator();

        System.out.println(pnv.isNAPhoneNumber("(123) 456-7890"));
        System.out.println(pnv.isNAPhoneNumber("(123).456.7890"));
        System.out.println(pnv.isNAPhoneNumber("(123)-456 7890"));
        System.out.println(pnv.isNAPhoneNumber("123-456-7890"));
        System.out.println(pnv.isNAPhoneNumber("123.456.7890"));
        System.out.println(pnv.isNAPhoneNumber("1234567890"));
        System.out.println(pnv.isNAPhoneNumber("+1 123-456-7890"));
        System.out.println(pnv.isNAPhoneNumber("+1 (123) 456-7890"));
        System.out.println(pnv.isNAPhoneNumber("123 456 7890"));
        System.out.println(pnv.isNAPhoneNumber("+1.123.456.7890"));
    }
}
