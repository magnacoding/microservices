package com.imaging.content.received.module.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by irichiez on 5/13/17.
 */
@Data
@Entity
public class Document {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String format;
    private int numbOfPages;

    public Document() {
    }

    public Document(long id, String name, String format, int numbOfPages) {
        this.id = id;
        this.name = name;
        this.format = format;
        this.numbOfPages = numbOfPages;
    }
}
