package calculadora.calculadora.infrastructure.api.mappers;

import calculadora.calculadora.domain.Resultado;
import calculadora.calculadora.infrastructure.api.dto.ResultadoDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ResultadoDtoMapper {

    ResultadoDto toDto(Resultado domain);
}
