package org.mandulis.mts.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GroupRequest {
    @NotBlank(message = "Group name cannot be blank")
    @NotNull
    @Size(min = 3, max = 20, message = "Username must be between 3 and 20 characters")
    private String name;
    private String description;
}