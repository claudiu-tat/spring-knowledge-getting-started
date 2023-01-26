package ro.sda.aop_example_2.models;

import lombok.*;
import ro.sda.aop_example_2.annotation.LoggerAudit;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Account {
    private String iban;
    private String clientName;
    private int balance;

}
