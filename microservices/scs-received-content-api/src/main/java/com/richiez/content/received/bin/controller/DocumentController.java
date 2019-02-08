package com.richiez.content.received.bin.controller;

import com.richiez.content.received.bin.domain.Document;
import com.richiez.content.received.bin.exception.DocumentNotFoundException;
import com.richiez.content.received.bin.service.ImagingDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by irichiez on 5/13/17.
 */
@RestController
@RequestMapping("/documents")
public class DocumentController {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Value("${docController.msg}")
    private String docControllerMsg;

    @Value("${helloMsg}")
    private String environmentMsg;

    @Autowired
    private ImagingDocument imagingDocument;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return this.docControllerMsg + " FROM " + environmentMsg;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Collection<Document> getAllDocuments() {
        return imagingDocument.getAllDocuments();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Document getDocumentById(@PathVariable("id") int id) throws DocumentNotFoundException {
        Document doc = imagingDocument.getDocumentById(id);
        if (doc == null) {
            LOGGER.error("ERROR: The Document requested was not found!");
            throw new DocumentNotFoundException(id);
        }
        return doc;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public void deleteDocument(@PathVariable int id) {
        imagingDocument.deleteDocument(id);
    }

//    @RequestMapping(value = "/delete", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
//    public void deleteDocument(@RequestBody Long id){
//        imagingDocument.deleteDocument(id);
//    }

    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createDocument(@RequestBody Document document) {
        imagingDocument.createDocument(document);
    }
}
