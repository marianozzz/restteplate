package examen.examen.controller;

import examen.examen.model.LinesInactive;
import examen.examen.service.IntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    IntegrationService integrationService;


    @GetMapping("/lines")
    public LinesInactive getLine() {
        return integrationService.getlines();
    }


}
