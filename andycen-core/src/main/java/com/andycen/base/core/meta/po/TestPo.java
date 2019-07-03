package com.andycen.base.core.meta.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author cenruyi
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "t_test")
public class TestPo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
