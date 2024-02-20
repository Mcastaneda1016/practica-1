package proyec.practica1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import api.entity.Usuario;
import modelo.usuario;


@SpringBootApplication
@RestController
public class Practica1Application {

	public static void main(String[] args) {
		SpringApplication.run(Practica1Application.class, args);
	}
	
	@GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("Hello %s!", name);
    }

	@GetMapping("/user")
    public usuario consulta(Integer id, Integer cc, String nombre, String apellido, String direccion ) {
      return new usuario( id,  cc,  nombre,  apellido,  direccion );
	}
}
