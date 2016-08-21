package org.ahea.blindinterview.model.resume;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class ResumeFileVO {
   
  private String resumeFileId;
	
  private String fileType;
  
  private String filePath;
 
}
