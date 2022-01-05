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

    @PostMapping("/api/search")
    public String searchTranslate(@RequestParam String query){
        String result = naverTranslate.search(query);
//        System.out.println(result);
        return naverTranslate.saveDto(result);
    }
}
