package com.imaging.content.received.module.repository;

import com.imaging.content.received.module.domain.Document;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by irichiez on 5/13/17.
 */
public interface DocumentRepository extends JpaRepository<Document, Long> {

}
