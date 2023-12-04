package file.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "file")
@Table(name = "file")
public class File {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    String name;

}
