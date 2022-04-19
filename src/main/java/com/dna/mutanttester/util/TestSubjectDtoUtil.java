package com.dna.mutanttester.util;

import com.dna.mutanttester.dto.TestSubjectDto;
import com.dna.mutanttester.model.TestSubject;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class TestSubjectDtoUtil {

    public static TestSubjectDto getDtoFromTestSubject(TestSubject subject) {
        return TestSubjectDto.builder()
                .dnaString(subject.getDnaString())
                .isMutant(subject.isMutant())
                .build();
    }
}
