package fabricio.com.github.desafio01developers.service;

import fabricio.com.github.desafio01developers.model.entity.JSON;
import org.springframework.stereotype.Service;

@Service
public class JsonService {

    public JSON imprimirOlaMundo() {
        JSON json = new JSON();
        json.setMensagem("Olá, Mundo!");
        return json;
    }
}
