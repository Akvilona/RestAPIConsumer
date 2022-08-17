import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Создал Андрей Антонов 17.08.2022 9:59
 **/

public class Consumer  {
    public static void main(String[] args) {

        /** делаем запрос к сервису https://reqres.in/ */
        RestTemplate restTemplate = new RestTemplate();

        /** создаем Hash Map так как в нем есть ключи и значения */
        Map<String, String>  jsonToSend = new HashMap<>();
        jsonToSend.put("name", "Test name");
        jsonToSend.put("job", "Test job");

        /** чтобы отправить этот json мы его должны упаковать в объект httpEntity */
        HttpEntity <Map<String, String >> request = new HttpEntity<>(jsonToSend);

        /** Запрос к удаленному сервису, запрос может быть get и post */
        String url = "https://reqres.in/api/users";
        String response = restTemplate.postForObject(url, request, String.class);

        /** выводим результат на экран */
        System.out.println(response);
    }
}
