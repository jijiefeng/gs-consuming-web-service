package hello;

import hello.wsdl.GetCountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private CountryClient wsClient;
    @RequestMapping("callws")
    public Object callWs() {
        GetCountryResponse response = wsClient.getCountry("Spain");
        return response.getCountry();
    }
}
