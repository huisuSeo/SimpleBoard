package com.example.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;

import java.util.Optional;

import com.example.sbb.answer.Answer;
import com.example.sbb.answer.AnswerRepository;
import com.example.sbb.question.Question;
import com.example.sbb.question.QuestionRepository;
import com.example.sbb.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private QuestionService questionService;

    @Test
    void testJpa() {
        for(int i = 1 ; i <= 300; i++){
            String subject = String.format("테스트 데이터입니다:[%03d]",i);

            String content = "내용무";
            this.questionService.create(subject, content);
        }
    }
}
