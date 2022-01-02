package com.konsent.navertranslate.utils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.konsent.navertranslate.model.TranslateRequestDto;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import java.util.Map;

@Component
public class NaverTranslate {
    public String search(String query){
        RestTemplate rest = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        headers.add("X-Naver-Client-Id", "bQfMRRko1CVxGgDMdkEB");
        headers.add("X-Naver-Client-Secret", "xfUDH4v2Ai");

        StringBuilder sb = new StringBuilder();
        sb.append("source=ko&target=fr&text=" + query);
        String body = sb.toString();

        HttpEntity<String> requestEntity = new HttpEntity<String>(body, headers);
        ResponseEntity<String> responseEntity = rest.exchange("https://openapi.naver.com/v1/papago/n2mt", HttpMethod.POST, requestEntity, String.class);
        HttpStatus httpStatus = responseEntity.getStatusCode();
        int status = httpStatus.value();
        String response = responseEntity.getBody();
//        System.out.println("Response status: " + status);
//        System.out.println(response);
        return response;
    }

        public static void main(String[] args){
            NaverTranslate naverTranslate = new NaverTranslate();
            String result = naverTranslate.search("베를린에 가보셨나요?");
            System.out.println(result);
    }
}
