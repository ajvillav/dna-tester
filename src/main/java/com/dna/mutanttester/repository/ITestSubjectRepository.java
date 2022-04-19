package com.dna.mutanttester.repository;

import com.dna.mutanttester.model.TestSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ITestSubjectRepository extends JpaRepository<TestSubject, UUID> {
}
