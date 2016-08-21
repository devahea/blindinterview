package org.ahea.blindinterview.model.advertise;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AdvertiseFileVO {
	private String fileTypeId;
	
	private String fileType;

	private String fileSize;

	private String filePath;

}
