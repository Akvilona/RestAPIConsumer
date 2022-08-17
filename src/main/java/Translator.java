import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Создал Андрей Антонов 17.08.2022 12:43
 **/

public class Translator {
    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("Введите предложение на русском языке:");
        Scanner scanner = new Scanner(System.in);
        String sentenceToTranslate = scanner.nextLine();

        RestTemplate restTemplate = new RestTemplate();

        String url =  "https://translate.api.cloud.yandex.net/translate/v2/translate";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add ("Authorization", "Bearer " + "t1.9euelZqNjZ6amJWJlpGVlc2cjZTJl-3rnpWajJrInZPHiZiej5DLyZmakJfl8_d3bQxo-e9zOXsx_d3z9zccCmj573M5ezH9._rnk14Cm8jUGqkvF0wPXCwaf9vxYqTf8ZwnCsa0odSSBbarSj4bM98erixTKHGzuLdMV4UscizYU-DQgLyaTCg");

        Map <String, String> jsonData = new HashMap<>();
        jsonData.put("folderId", "b1gh10s3cevpgk17udlr");
        jsonData.put ("targetLanguageCode", "en");
        jsonData.put ("texts", "["  + sentenceToTranslate +"]");

        HttpEntity<Map<String, String>> request = new HttpEntity<>(jsonData, headers);

        /** запрос к Яндексу */
        YandexResponse response = restTemplate.postForObject(url, request, YandexResponse.class);

        /** Вывожу перевод в консоль */
        System.out.println("Перевод: " + response.getTranslations().get(0).getText());
    }
}
