package lab_12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularString {
    public boolean ex_3(String date)
    {
     String regex = "([1-2][0-9]|0[1-9]|30)/(0[469]|11)/(19[0-9][0-9]|[2-9][0-9][0-9][0-9])|" +
                    "([1-2][0-9]|0[1-9]|3[0-1])/(0[13678]|10|12)/(19[0-9][0-9]|[2-9][0-9][0-9][0-9])|"+
                    "([1-2][0-8]|0[1-9])/02/(19[0-9][0-9]|[2-9][0-9][0-9][0-9])|" +
                    "29/02/(19([02468][048]|[13579][26])|[2-9][0-9]([02468][048]|[13579][26]))";
     Pattern p = Pattern.compile(regex);
     Matcher m = p.matcher(date);
     return m.matches();
    }
}
