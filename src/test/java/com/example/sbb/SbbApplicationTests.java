package com.example.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private QuestionRepository quetionRepository;

    @Test
    void testJpa() {
    List<Question> qList = this.quetionRepository.findBySubjectLike("sbb%");
    Question q = qList.get(0);
    assertEquals("sbb가 무엇인가요?",q.getSubject());

    }

}
