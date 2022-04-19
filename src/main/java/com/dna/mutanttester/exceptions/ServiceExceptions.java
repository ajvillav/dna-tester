package com.dna.mutanttester.exceptions;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ServiceExceptions {

    public static class NotMutant extends BaseException {
        private static final long serialVersionUID = 1L;

        public NotMutant(String msg) {
            super(msg);
        }
    }
}
