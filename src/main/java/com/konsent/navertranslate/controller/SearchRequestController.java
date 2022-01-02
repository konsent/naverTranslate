package com.konsent.navertranslate.controller;
import com.konsent.navertranslate.model.Translate;
import com.konsent.navertranslate.model.TranslateRepository;
import com.konsent.navertranslate.model.TranslateRequestDto;
import com.konsent.navertranslate.utils.NaverTranslate;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor

public class SearchRequestController {

    private final NaverTranslate naverTranslate;

    @PostMapping("/api/searches")
    public String searchTranslate(@RequestParam String query){
        return naverTranslate.search(query);
    }
}
