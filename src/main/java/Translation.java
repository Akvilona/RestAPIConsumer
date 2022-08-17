/**
 * Создал Андрей Антонов 17.08.2022 14:35
 **/

public class Translation {
    private String text;
    private String detectedLanguageCode;

    /** создаем геттеры и сеттеры */
    public String getText() {
        return text;
    }

    /** создаем геттеры и сеттеры */
    public void setText(String text) {
        this.text = text;
    }

    /** создаем геттеры и сеттеры */
    public String getDetectedLanguageCode() {
        return detectedLanguageCode;
    }

    /** создаем геттеры и сеттеры */
    public void setDetectedLanguageCode(String detectedLanguageCode) {
        this.detectedLanguageCode = detectedLanguageCode;
    }
}
