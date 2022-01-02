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
    public List<TranslateRequestDto> searchTranslate(@RequestParam String query){
        String result = naverTranslate.search(query);
        return naverTranslate.saveDto(result);
    }
}
