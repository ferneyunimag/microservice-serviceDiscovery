package com.kcrs.estudio.microservice.DaoRepository;

import ch.qos.logback.core.net.server.Client;
import com.kcrs.estudio.microservice.client.domain.client.ClientInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDao extends JpaRepository<ClientInfo, Integer> {
}
