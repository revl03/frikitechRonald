package calculadora.calculadora.infrastructure.api.mappers;

import calculadora.calculadora.domain.Resultado;
import calculadora.calculadora.infrastructure.api.dto.ResultadoDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-08T13:39:09+0200",
    comments = "version: 1.6.0, compiler: javac, environment: Java 17.0.11 (OpenLogic)"
)
@Component
public class ResultadoDtoMapperImpl implements ResultadoDtoMapper {

    @Override
    public ResultadoDto toDto(Resultado domain) {
        if ( domain == null ) {
            return null;
        }

        ResultadoDto resultadoDto = new ResultadoDto();

        resultadoDto.setResultado( domain.getResultado() );

        return resultadoDto;
    }
}
