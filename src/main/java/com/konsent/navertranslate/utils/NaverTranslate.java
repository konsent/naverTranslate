package com.konsent.navertranslate.utils;



import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Map;


public class NaverTranslate {
    public String search(String inputLang, String outputLang, String text) {
        RestTemplate rest = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        headers.add("X-Naver-Client-Id", "bQfMRRko1CVxGgDMdkEB");
        headers.add("X-Naver-Client-Secret", "xfUDH4v2Ai");

        StringBuilder sb = new StringBuilder();
        sb.append("source=" + inputLang + "&target=" + outputLang + "&text=" + text);
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

        public static void main(String[] args) throws JsonProcessingException {
            NaverTranslate naverTranslate = new NaverTranslate();
            String resultJSON = naverTranslate.search("ko", "fr", "베를린에 가보셨나요?");









    }
}
