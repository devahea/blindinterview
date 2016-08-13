package org.ahea.blindinterview.model.advertise;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertiseFileRepository extends CrudRepository<AdvertiseFile, String>{
 
}
