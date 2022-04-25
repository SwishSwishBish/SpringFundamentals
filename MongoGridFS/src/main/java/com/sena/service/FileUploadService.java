package com.sena.service;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class FileUploadService {

    private final GridFsTemplate gridFsTemplate;

    public void uploadFile(MultipartFile file) {
        DBObject dbObject = new BasicDBObject();
        dbObject.put("fileName", file.getName());
        dbObject.put("contentType", file.getContentType());
        dbObject.put("size", file.getSize());
        ObjectId id = null;
        try {
            id = gridFsTemplate.store(file.getInputStream(), file.getOriginalFilename(), dbObject);
        } catch (IOException e) {
            System.out.println(e);;
        }
        System.out.println(id.toString());

    }
}
