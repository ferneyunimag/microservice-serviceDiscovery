package com.kcrs.estudio.microservice.services.ClientDaoservice;

import com.kcrs.estudio.microservice.client.domain.client.ClientInfo;

import java.util.List;

public interface CLientDaoInterface {

    ClientInfo findClientById(Integer id);
    List<ClientInfo> findAllClient();
    void SaveClient(ClientInfo clientInfo);
}
