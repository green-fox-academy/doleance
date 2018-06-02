package com.greenfoxacademy.springstart;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class Controller {
    private String name;

    @RequestMapping(method = RequestMethod.GET, value = "cicak")
        public ArrayList<String> getCicaNames() {
            return new ArrayList<>(
                    Arrays.asList(
                            "Cirmi",
                            "Tóbiás",
                            "Büdös dög",
                            "Garfield"
                    )
            );
        }



    }

