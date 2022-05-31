package com.kcrs.estudio.microservice.services.ClientDaoservice;


import com.kcrs.estudio.microservice.DaoRepository.ClientDao;
import com.kcrs.estudio.microservice.client.domain.client.ClientInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientDaoService implements CLientDaoInterface {
    @Autowired
    ClientDao clientDao;

    public ClientInfo findClientById(Integer id) {
        Optional optional = clientDao.findById(id);
        if (optional.isPresent()) {
            ClientInfo clientInfo = (ClientInfo) optional.get();
            return clientInfo;
        }
        return null;
    }

    public List<ClientInfo> findAllClient() {
        List<ClientInfo> clients = (List<ClientInfo>) clientDao.findAll();
        return clients;
    }

    @Override
    public void SaveClient(ClientInfo clientInfo) {
    clientDao.save(clientInfo);

    }


}
