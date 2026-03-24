package nttdata.bootcamp.apigateway.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

    @GetMapping("/customers")
    public Mono<ResponseEntity<String>> customerFallback() {
        return Mono.just(ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
                .body("El servicio de clientes no está disponible o está tardando demasiado. (Fallback)"));
    }

    @GetMapping("/accounts")
    public Mono<ResponseEntity<String>> accountsFallback() {
        return Mono.just(ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
                .body("El servicio de cuentas no está disponible o está tardando demasiado. (Fallback)"));
    }

    @GetMapping("/credits")
    public Mono<ResponseEntity<String>> creditsFallback() {
        return Mono.just(ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
                .body("El servicio de créditos no está disponible o está tardando demasiado. (Fallback)"));
    }

    @GetMapping("/transactions")
    public Mono<ResponseEntity<String>> transactionsFallback() {
        return Mono.just(ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
                .body("El servicio de transacciones no está disponible o está tardando demasiado. (Fallback)"));
    }

    @GetMapping("/yanki")
    public Mono<ResponseEntity<String>> yankiFallback() {
        return Mono.just(ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
                .body("El servicio de Yanki no está disponible o está tardando demasiado. (Fallback)"));
    }

    @GetMapping("/debit-cards")
    public Mono<ResponseEntity<String>> debitCardsFallback() {
        return Mono.just(ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
                .body("El servicio de tarjetas de débito no está disponible o está tardando demasiado. (Fallback)"));
    }
}
