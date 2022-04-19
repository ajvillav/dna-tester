package com.dna.mutanttester.controller;

import com.dna.mutanttester.dto.TestSubjectDto;
import com.dna.mutanttester.service.TestSubjectService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/mutanttester")
public class TestSubjectController {

    private TestSubjectService testSubjectService;

    @PostMapping(value = "/mutant")
    public ResponseEntity<?> checkMutant(@RequestBody TestSubjectDto requestDto) {
        return testSubjectService.isMutant(requestDto.getDnaString());
    }
}
