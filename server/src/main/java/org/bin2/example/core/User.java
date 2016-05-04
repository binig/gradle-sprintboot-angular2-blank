package org.bin2.example.core;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 *
 */
@Entity
public class User {

    @Id
    @GeneratedValue()
    private Long id;

    @OneToMany
    private List<ExternalAuth> externalAuths;
}
