package com.example.telepardaz.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@ToString
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("PERSON")
public class PersonMerchant extends Merchant {
    private String firstName;
    private String lastName;
}
