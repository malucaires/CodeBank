package br.com.codebank.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CustomerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long idCustomer;
    private String name;
    private String socialName;
    private String gender;
    @Embedded
    private AddressModel address;
    private LocalDate birthDate;
    @Column(unique = true, updatable = false)
    private String cpf;
    @Column(unique = true)
    private String phoneNumber;
    @OneToOne
    @JoinColumn(name = "account_id")
    private AccountModel account;

    public AddressModel getAddress() {
        return address;
    }

}

