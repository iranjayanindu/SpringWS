package lk.ijse.ws.test1.api;

import lk.ijse.ws.test1.data.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

//@RestController
//@RequestMapping("/api")
//public class MyRestController {
//
//    @GetMapping(path = "/hello", produces = "text/plain")
//    public ResponseEntity<Message> sayHello() {
//        Message msg = new Message();
//        return new ResponseEntity<Message>(msg, HttpStatus.OK);
//    }
//}
@RestController
public class MyRestController{
    @GetMapping("/api/hello")
    public Message greeting(){
        Message msg = new Message();
        msg.setSender("Sender");
        msg.setMessage("hello World");
        msg.setDate(new Date());
        return msg;
    }
}

