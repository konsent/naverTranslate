package com.konsent.navertranslate.controller;

import com.konsent.navertranslate.model.Translate;
import com.konsent.navertranslate.model.TranslateRepository;
import com.konsent.navertranslate.model.TranslateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor
public class TranslateController {

    final TranslateRepository translateRepository;

    @PostMapping("/api/results")
    public Translate getResults(@RequestBody TranslateRequestDto requestDto){
        Translate translate = new Translate(requestDto);
        return translateRepository.save(translate);
    }
}
