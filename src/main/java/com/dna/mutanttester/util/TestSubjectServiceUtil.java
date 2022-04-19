package com.dna.mutanttester.util;

import com.dna.mutanttester.model.TestSubject;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class TestSubjectServiceUtil {

    public static TestSubject getTestSubject(boolean isMutant, String[] dnaString) {
        return TestSubject.builder()
                .dnaString(dnaString)
                .isMutant(isMutant)
                .build();
    }

    public static boolean checkMutantSubject(String[] dnaString) {
        return true;
    }
}
