package fabricio.com.github.desafio01developers.controller;

import fabricio.com.github.desafio01developers.model.entity.JSON;
import fabricio.com.github.desafio01developers.service.JsonService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {

    @Autowired
    private JsonService jsonService;

    @GetMapping("/")
    public JSON imprimirOlaMundo() {
        return jsonService.imprimirOlaMundo();
    }

}
