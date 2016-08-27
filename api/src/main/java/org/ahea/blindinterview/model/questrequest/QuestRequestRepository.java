package org.ahea.blindinterview.model.questrequest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestRequestRepository extends CrudRepository<QuestRequest, String>{

}
