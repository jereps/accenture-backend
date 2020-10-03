package com.accenture.accenturecase.controller;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
@CrossOrigin
public class MensagemController {

    @GetMapping(value = "/{mensagem}")
    public String frase(
            @PathVariable("mensagem") String mensagem) {

        return "tratuzir";
    }

}
