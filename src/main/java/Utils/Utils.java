package Utils;

import java.util.ResourceBundle;

public class Utils {
    public static ResourceBundle getPropertiesFile() {
        return  ResourceBundle.getBundle("config");
    }
}
