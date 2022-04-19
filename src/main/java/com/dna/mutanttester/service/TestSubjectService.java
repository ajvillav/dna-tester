package com.dna.mutanttester.service;

import com.dna.mutanttester.repository.ITestSubjectRepository;
import com.dna.mutanttester.util.TestSubjectDtoUtil;
import com.dna.mutanttester.util.TestSubjectServiceUtil;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TestSubjectService {

    ITestSubjectRepository testSubjectRepository;

    public ResponseEntity<?> isMutant(String[] dnaString) {
        if(Boolean.FALSE.equals(TestSubjectServiceUtil.checkMutantSubject(dnaString))) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(TestSubjectDtoUtil.getDtoFromTestSubject(
                    testSubjectRepository.save(TestSubjectServiceUtil.getTestSubject(false, dnaString))));
        }else {
            return ResponseEntity.status(HttpStatus.OK).body(TestSubjectDtoUtil.getDtoFromTestSubject(
                    testSubjectRepository.save(TestSubjectServiceUtil.getTestSubject(true, dnaString))));
        }
    }
}
