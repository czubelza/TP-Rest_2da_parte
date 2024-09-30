package com.example.inicial1.services;

import com.example.inicial1.entities.Localidad;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/localidades")
public interface LocalidadService extends BaseService<Localidad, Long> {
}
