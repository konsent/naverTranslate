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
    private String source;

    @Column(nullable = false)
    private String target;

    @Column(nullable = false)
    private String text;

    public Translate(TranslateRequestDto requestDto){
        this.source = requestDto.getSource();
        this.target = requestDto.getTarget();
        this.text = requestDto.getText();
    }

}
