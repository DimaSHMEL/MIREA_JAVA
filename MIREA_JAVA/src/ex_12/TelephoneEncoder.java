package ex_12;

public class TelephoneEncoder {
    public String normalPhone(String phonenumber) {
        //Проерка длины номера
        if(phonenumber.length() > 10) {
            //Получение номера страны
            String country = phonenumber.substring(0, phonenumber.length() - 10);
            //Получение номера самого
            String number = phonenumber.substring(phonenumber.length() - 10);
            String phone;
            //Проверка на + вначале
            if (country.charAt(0) == '+') {
                phone = country + number.substring(0, 3) + "-" + number.substring(3, 6) + "-" + number.substring(6, 10);
            } else {
                phone = "+" + country + number.substring(0, 3) + "-" + number.substring(3, 6) + "-" + number.substring(6, 10);
            }
            return phone;
        }
        else
            return "NOT VALID PHONENUMBER";
    }
}
