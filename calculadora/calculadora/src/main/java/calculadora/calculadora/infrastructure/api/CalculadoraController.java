package calculadora.calculadora.infrastructure.api;

import calculadora.calculadora.application.api.CalculadoraService;
import calculadora.calculadora.infrastructure.api.dto.ResultadoDto;
import calculadora.calculadora.infrastructure.api.mappers.ResultadoDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
    private final CalculadoraService service;
    private final ResultadoDtoMapper mapper;

    @GetMapping("/calculadora")
    public ResponseEntity<ResultadoDto> calcular(@RequestParam String num1, @RequestParam String num2, @RequestParam String operacion)throws Exception{
        return ResponseEntity.ok(mapper.toDto(service.calcular(num1, num2,operacion)));
    }

}
