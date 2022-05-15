package study;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Data
public class Order {
    private Long id;
    private Date placedAt;

    @NotBlank(message="이름은 비워둘 수 없습니다.")
    private String deliveryName;

    @NotBlank(message="Street은 비워둘 수 없습니다.")
    private String deliveryStreet;

    @NotBlank(message="도시는 비워둘 수 없습니다.")
    private String deliveryCity;

    @NotBlank(message="State는 비워둘 수 없습니다.")
    private String deliveryState;

    @NotBlank(message="Zip 코드는 비워둘 수 없습니다.")
    private String deliveryZip;

    @CreditCardNumber(message="유효한 카드 번호가 아닙니다.")
    private String ccNumber;

    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$", message="MM/YY 형식이어야 합니다.")
    private String ccExpiration;

    @Digits(integer=3, fraction=0, message="유효한 CVV가 아닙니다.")
    private String ccCVV;
}
