package fed.in.application1.controller;

import fed.in.application1.service.App1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App1Controller {

    @Autowired
    private App1Service app1Service;

    @GetMapping("/app1")
    public String app1Async(){
        app1Service.sendMessageToApp2();
        return "Message send to App2";
    }

    @GetMapping("/request")
   public String app1AsyncDelay(){
        app1Service.sendNotificationMsgToApp2Delay();
        return "Message send to App2 Delay";
}


}
