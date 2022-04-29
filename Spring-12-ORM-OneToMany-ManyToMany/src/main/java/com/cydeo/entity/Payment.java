package com.cydeo.entity;

import com.cydeo.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "payments")
@Data
@NoArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "DATE")
    private LocalDate created_date;

    @Enumerated(EnumType.STRING)
    private Status payment_status;

    private BigDecimal amount;

    @OneToOne(cascade = CascadeType.ALL)
    private  PaymentDetail paymentDetail;

    public Payment(LocalDate created_date,BigDecimal amount, Status payment_status) {
        this.created_date = created_date;
        this.payment_status = payment_status;
        this.amount = amount;
    }
}
