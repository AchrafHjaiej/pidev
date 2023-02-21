package tn.esprit.pidev.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
/*
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
*/

public class User implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idMembre;
    private String FirstName;
    private String LastName;
    private String Pseudo;
    private String Password;
    private String Mail;
    private String NumTel;
    private String Adresse;
    @Temporal(TemporalType.DATE)
    private Date Inscription_Date;
    private String Gender;

    @OneToMany (mappedBy = "user")
    List<Claim> listC;

    @ManyToMany
    List<Claim> listClaim;

}
