package br.edu.umfg.firstapi.controllers;

import br.edu.umfg.entities.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    private List<Client> list = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Client>> getClients() {

        return ResponseEntity.ok(list);
    }


    @PostMapping
    public ResponseEntity<Client> postClient(@RequestBody Client client) {
        list.add(client);
        return ResponseEntity.ok(client);
    }
}
