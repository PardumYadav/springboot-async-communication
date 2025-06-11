package fed.in.application1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class App1Service {

    @Autowired
    private RestTemplate restTemplate;

    @Async
    public void sendMessageToApp2(){
        try {
    String response = restTemplate.getForObject("http://localhost:8081/app2/message", String.class);
    System.out.println("Message send from app1"+response);
       } catch (Exception e){
    System.out.println("Failed to send message");
}
    }

    @Async
    public void sendNotificationMsgToApp2DelayAsync() {
        for (int i = 0; i < 15; i++) {
            try {
                String response = restTemplate.getForObject("http://localhost:8081/app2/message", String.class);
                System.out.println("Thread: " + Thread.currentThread().getName() +
                        " | Message send from app1-" + response + " " + i);
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println("Failed to send message");
            }
        }
    }

    @Async
    public void callApp2Async(int i) {
        String response = restTemplate.getForObject("http://localhost:8081/app2/message", String.class);
        System.out.println("Message send from app1-" + response + " " + i);
    }

}




