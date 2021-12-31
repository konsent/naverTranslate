package com.konsent.navertranslate.model;

import lombok.Getter;

@Getter
public class TranslateRequestDto {

    private String source;
    private String target;
    private String text;
}
