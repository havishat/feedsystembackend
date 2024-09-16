package feed.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Address {
    private String addressLine1;
    private String addressLine2;
    private String AptNumber;
    private String zipCode;


}
