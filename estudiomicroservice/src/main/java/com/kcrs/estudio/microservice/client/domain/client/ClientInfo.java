package com.kcrs.estudio.microservice.client.domain.client;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name="client")
@Data
public class ClientInfo {
    @Id
    private  int id;
    private String name;
    private String lastName;
    private String email;
    private String BirthDate;



}
