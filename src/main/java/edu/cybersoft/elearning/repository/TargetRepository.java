package edu.cybersoft.elearning.repository;

import edu.cybersoft.elearning.domain.model.Target;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TargetRepository extends JpaRepository<Target, Long> {
}