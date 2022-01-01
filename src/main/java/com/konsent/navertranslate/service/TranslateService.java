package com.konsent.navertranslate.service;

import com.konsent.navertranslate.model.TranslateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class TranslateService {

    private final TranslateRepository translateRepository;

}
