package com.richiez.content.received.bin.repository;

import com.richiez.content.received.bin.domain.Document;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by irichiez on 5/13/17.
 */
public interface DocumentRepository extends JpaRepository<Document, Long> {

}
