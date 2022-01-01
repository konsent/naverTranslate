package com.konsent.navertranslate.controller;

import com.konsent.navertranslate.model.Translate;
import com.konsent.navertranslate.model.TranslateRepository;
import com.konsent.navertranslate.model.TranslateRequestDto;
import com.konsent.navertranslate.utils.NaverTranslate;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class SearchRequestController {

    private final NaverTranslate naverTranslate;

    @PostMapping("/api/results")
    public String searchTranslate(@RequestParam String inputLang, @RequestParam String outputLang, @RequestParam String text){
        String result = naverTranslate.search(inputLang, outputLang, text);
        return result;
    }
}
