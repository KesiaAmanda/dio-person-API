package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {
    private long id;
    @Enumerated(EnumType.STRING)
    private PhoneType type;
    @NotEmpty
    @Size(min = 3, max = 3)
    private String ddd;
    @NotEmpty
    @Size(min = 8, max = 9)
    private String number;
}
