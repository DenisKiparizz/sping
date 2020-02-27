package person;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Adress {
    private Long id;
    private String city;
    private String streate;
    private List<Integer> flats;
}
