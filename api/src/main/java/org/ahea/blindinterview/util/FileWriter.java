package org.ahea.blindinterview.util;

import java.io.FileOutputStream;

import org.springframework.web.multipart.MultipartFile;

public class FileWriter {

	private FileWriter(){}
	
	public static FileWriter newInstance(){
		return new FileWriter();
	}
	
	 private FileOutputStream fos;
     
	    public String writeFile(MultipartFile file, String path, String fileName){
	         
	        try{
	         
	            byte fileData[] = file.getBytes();
	             
	            fos = new FileOutputStream(path + "/" + fileName);
	             
	            fos.write(fileData);
	         
	            return fileName;
	            
	        }catch(Exception e){
	             
	            e.printStackTrace();
	             
	        }finally{
	             
	            if(fos != null){
	                 
	                try{
	                    fos.close();
	                }catch(Exception e){}
	                 
	                }
	        }
	         
	        
	        return null;
	    }
	
}
