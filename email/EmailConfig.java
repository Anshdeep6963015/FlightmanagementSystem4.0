package email;

import java.util.Properties;

public class EmailConfig {
    public static final String SENDER_EMAIL = "anshdeep24072004@gmail.com"; // Make sure this is correct
    public static final String SENDER_PASSWORD = "fvpmaumpayzmmcnk"; // Your NEW App Password

    public static Properties getEmailProperties() {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        return props;
    }
}
