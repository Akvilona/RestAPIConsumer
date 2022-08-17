import java.util.List;

/**
 * Создал Андрей Антонов 17.08.2022 14:35
 **/

public class YandexResponse {
    private List<Translation>  translations;

    /** создаем геттеры и сеттеры */
    public List<Translation> getTranslations() {
        return translations;
    }

    /** создаем геттеры и сеттеры */
    public void setTranslations(List<Translation> translations) {
        this.translations = translations;
    }
}
