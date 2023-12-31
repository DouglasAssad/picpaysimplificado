package com.picpaydesafio.services;

import com.picpaydesafio.domain.user.User;
import com.picpaydesafio.dtos.NotificationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NotificationService {

    @Autowired
    public RestTemplate restTemplate;

    public void sendNotification(User user, String message)throws Exception{
        String email = user.getEmail();
        NotificationDTO notificationResquest = new NotificationDTO(email,message);

      /* ResponseEntity<String> notificationResponse = restTemplate.postForEntity("http://o4d9z.mocklab.io/notify", notificationResquest, String.class);

        if(!(notificationResponse.getStatusCode() == HttpStatus.OK)){
            System.out.println("Erro ao enviar a notificação...");
            throw new Exception ("Serviço de notificação fora do ar no momento...");
        }*/
        System.out.println("Notificação enviada com sucesso !");
        System.out.println();
    }
}
