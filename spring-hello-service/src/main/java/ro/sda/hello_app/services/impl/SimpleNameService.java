package ro.sda.hello_app.services.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ro.sda.hello_app.services.NameService;

@Service
@Qualifier("simple")
public class SimpleNameService implements NameService {
    @Override
    public String getName() {
        return "John";
    }
}