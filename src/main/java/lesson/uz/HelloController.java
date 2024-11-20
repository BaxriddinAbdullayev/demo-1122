package lesson.uz;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("")
    private ResponseEntity<String> all(){
        return ResponseEntity.ok("Assalomu alaykum hurmatli foydalanuvchi!!!!");
    }

}
