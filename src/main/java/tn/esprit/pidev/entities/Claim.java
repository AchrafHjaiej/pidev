package tn.esprit.pidev.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Claim implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClaim;
    private String Description;
    @Temporal(TemporalType.DATE)
    private Date Date;
    private String State;

    @ManyToOne
    User user;

    @ManyToMany (mappedBy = "claim")
    List<User>listU;
}
