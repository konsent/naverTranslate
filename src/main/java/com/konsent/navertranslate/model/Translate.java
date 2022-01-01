package com.konsent.navertranslate.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Translate extends Timestamped{

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private String id;

    @Column(nullable = false)
    private String srcLangType;

    @Column(nullable = false)
    private String tarLangType;

    @Column(nullable = false)
    private String translatedText;

    public Translate(TranslateRequestDto requestDto){
        this.srcLangType = requestDto.getSrcLangType();
        this.tarLangType = requestDto.getTarLangType();
        this.translatedText = requestDto.getTranslatedText();
    }

}
