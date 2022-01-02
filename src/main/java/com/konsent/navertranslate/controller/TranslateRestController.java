package com.konsent.navertranslate.controller;

import com.konsent.navertranslate.model.Translate;
import com.konsent.navertranslate.model.TranslateRepository;
import com.konsent.navertranslate.model.TranslateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TranslateRestController {

    final TranslateRepository translateRepository;

    @GetMapping("/api/results")
    public List<Translate> getResults(){
        return translateRepository.findAll();
    }

    @PostMapping("/api/results")
    public Translate createResult(@RequestBody TranslateRequestDto requestDto){
        Translate translate = new Translate(requestDto);
        return translateRepository.save(translate);
    }

}
