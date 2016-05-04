package org.bin2.example.core;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 */
@Entity
public class ExternalAuth {

    @Id
    private Long id;

    @ManyToOne
    private User user;
}
