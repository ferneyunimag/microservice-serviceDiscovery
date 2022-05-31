package com.kcrs.estudio.microservice.ControllerClient;

import com.kcrs.estudio.microservice.client.domain.client.ClientInfo;
import com.kcrs.estudio.microservice.services.ClientDaoservice.CLientDaoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/client/info")
public class ClientController {

    @Autowired
    CLientDaoInterface cLientDao;

    @GetMapping("/{id}")
    public @ResponseBody ClientInfo getClient(@PathVariable int id) {
        return cLientDao.findClientById(id);
    }

    @GetMapping("/")
    public @ResponseBody List<ClientInfo> getAllClient() {
        return cLientDao.findAllClient();
    }

    @PostMapping(path = "/",
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.OK)
    public void saveClientInfo(@RequestBody ClientInfo clientInfo) {
        cLientDao.SaveClient(clientInfo);
    }


}
