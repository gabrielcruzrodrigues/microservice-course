package org.gabriel.microservices.core.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "course")
public class ApplicationUser implements AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @NotBlank
    @NotNull(message = "The field 'username' is mandatory")
    @Column(nullable = false, unique = true)
    private String username;

    @NotBlank
    @NotNull(message = "The field 'password' is mandatory")
    @Column(nullable = false)
    private String password;
}
