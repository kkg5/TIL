package study;

import lombok.Data;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
public class Taco {
    private Long id;
    private Date createdAt;

    @NotNull
    @Size(min=5, message="이름은 최소 5글자 입니다.")
    private String name;

    @Size(min=1, message="최소 1개의 ingredient를 선택해야 합니다.")
    private List<String> ingredients;
}
