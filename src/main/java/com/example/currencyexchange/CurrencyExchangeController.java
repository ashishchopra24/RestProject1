package com.example.currencyexchange;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.env.Environment;

@RestController
public class CurrencyExchangeController {

    //@Autowired
  //  private CurrencyExchangeRepository repository;

    @Autowired
    private Environment environment;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchangeValue(
            @PathVariable String from,
            @PathVariable String to) {
        /*CurrencyExchange currencyExchange
                = repository.findByFromAndTo(from, to);

        if(currencyExchange ==null) {
            throw new RuntimeException
                    ("Unable to Find data for " + from + " to " + to);
        }

        String port = environment.getProperty("local.server.port");
*/
        //currencyExchange.setEnvironment("8089");
        return new CurrencyExchange(1L,"USD","INR",BigDecimal.valueOf(75));
        //return currencyExchange;

    }
}
