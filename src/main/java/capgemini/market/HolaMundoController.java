package capgemini.market;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HolaMundoController {

  @GetMapping("/saludar")
  public String saludar(){
    return "Hola mundo en spring";
  }
}
