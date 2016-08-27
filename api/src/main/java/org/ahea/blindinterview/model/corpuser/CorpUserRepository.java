package org.ahea.blindinterview.model.corpuser;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorpUserRepository extends CrudRepository<CorpUser, String>{

}
