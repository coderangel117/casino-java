package fr.perino.casino.util.Translator;

import java.util.Locale;
import java.util.ResourceBundle;

public class Translator {

    private final ResourceBundle messages;

    public Translator(String language){
        Locale locale =  new Locale(language);
        messages = ResourceBundle.getBundle("messages", locale);
    }
    public String get(String key) {
        return messages.getString(key);
    }

}
