package com.konsent.navertranslate.controller;
import com.konsent.navertranslate.utils.NaverTranslate;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor

public class SearchRequestController {

    private final NaverTranslate naverTranslate;

    @PostMapping("/api/search")
    public String searchTranslate(@RequestParam String query){
        String result = naverTranslate.search(query);
        return naverTranslate.saveDto(result);
    }
}
