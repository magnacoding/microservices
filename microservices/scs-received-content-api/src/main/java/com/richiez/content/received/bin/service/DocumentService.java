package com.richiez.content.received.bin.service;

import com.richiez.content.received.bin.domain.Document;

import java.util.Collection;

/**
 * Created by irichiez on 5/13/17.
 */
public interface DocumentService {

    Collection<Document> getAllDocuments();

    Document createDocument(Document document);

    Document getDocumentById(long id);

    Document updateDocument(long id, Document document);

    void deleteDocument(long id);
}
