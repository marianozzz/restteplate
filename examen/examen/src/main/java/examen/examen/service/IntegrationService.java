package examen.examen.service;

import examen.examen.model.LinesInactive;
import examen.examen.service.integration.IntegrationComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IntegrationService {
    @Autowired
    IntegrationComponent integrationComponent;

    public  LinesInactive getlines() {
        return integrationComponent.getLineFromApi();
    }
}
