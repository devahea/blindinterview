package org.ahea.blindinterview.model.corpuser;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CorpUserVO {

	private String corpUserId;

	private String email;

	private String password;

	private String name;

}
