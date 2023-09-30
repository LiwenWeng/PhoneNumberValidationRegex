public class PhoneNumberValidator {
    public boolean isNAPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("(?:\\+1[ .])?\\(?\\d{3}\\)?[ .-]?\\d{3}[ .-]?\\d{4}");
    }
}