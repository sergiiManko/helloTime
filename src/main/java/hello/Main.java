package hello;

import java.util.Locale;
import java.util.ResourceBundle;

public  class Main {
    public static void main(String[] args){
        Locale locale= Locale.getDefault();
        System.out.println(locale.getLanguage());
        ResourceBundle resourceBundle = ResourceBundle.getBundle("messageResource", locale);

        System.out.println(resourceBundle.getString("morning"));
    }
}
