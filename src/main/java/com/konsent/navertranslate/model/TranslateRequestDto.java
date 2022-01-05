package com.konsent.navertranslate.model;

import lombok.Getter;
import org.json.JSONObject;


@Getter
public class TranslateRequestDto {

    private String srcLangType;
    private String tarLangType;
    private String translatedText;

    public TranslateRequestDto(JSONObject translatedJSON){
        this.srcLangType = translatedJSON.getString("srcLangType");
        this.tarLangType = translatedJSON.getString("tarLangType");
        this.translatedText = translatedJSON.getString("translatedText");
    }
}
