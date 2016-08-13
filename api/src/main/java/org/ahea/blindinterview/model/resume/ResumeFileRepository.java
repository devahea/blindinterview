package org.ahea.blindinterview.model.resume;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumeFileRepository extends CrudRepository<ResumeFile, String>{
 
}