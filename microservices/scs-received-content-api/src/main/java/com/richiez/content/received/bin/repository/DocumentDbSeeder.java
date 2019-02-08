package com.richiez.content.received.bin.repository;

import com.richiez.content.received.bin.domain.Document;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by irichiez on 5/13/17.
 */
@Component
public class DocumentDbSeeder implements CommandLineRunner {

    private DocumentRepository documentRepository;

    public DocumentDbSeeder(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Document doc1 = new Document(5l, "pdfDocument", ".pdf", 5);
        Document doc2 = new Document(3l, "tiffDocument", ".tiff", 1);
        Document doc3 = new Document(7l, "docxDocument", ".docx", 2);

        List<Document> docs = new ArrayList<>();
        docs.add(doc1);
        docs.add(doc2);
        docs.add(doc3);

        this.documentRepository.save(docs);
    }
}
