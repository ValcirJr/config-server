package org.example.configerserver.resources;

import org.example.configerserver.model.MyConfiguration;
import org.example.configerserver.repository.ConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConfigurationResource {

    private final ConfigurationRepository repository;

    @Autowired
    public ConfigurationResource(ConfigurationRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/config")
    public ResponseEntity<String> save(@RequestBody MyConfiguration configuration){
        repository.save(configuration);
        return ResponseEntity.ok("Saved");
    }


}
