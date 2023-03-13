package com.javawhizz.questions;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Response {
    private boolean isAnswered;
    private int score;
    private String link;
    private String title;

}
