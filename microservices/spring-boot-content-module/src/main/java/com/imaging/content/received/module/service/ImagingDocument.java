package com.imaging.content.received.module.service;

import com.imaging.content.received.module.domain.Document;
import com.imaging.content.received.module.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by irichiez on 5/13/17.
 */
@Service
public class ImagingDocument implements DocumentService {


    private DocumentRepository documentRepository;

    @Autowired
    public ImagingDocument(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public List<Document> getAllDocuments() {
        return documentRepository.findAll();
    }

    public Document getDocumentById(long id) {
        return documentRepository.findOne(id);
    }

    public Document createDocument(Document document) {
        // save the new Document
        return documentRepository.save(document);
    }

    public void deleteDocument(long id) {
        documentRepository.delete(id);
    }

    public Document updateDocument(long id, Document document) {
        Document doc = documentRepository.findOne(id);
        if (doc.getFormat() != null) {
            doc.setFormat(document.getFormat());
        }
        return documentRepository.save(doc);
    }
}
