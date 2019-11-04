package cn.itcast.domain;

import lombok.Data;

import javax.persistence.Id;

@Data()
public class Account {
    @Id
    private Integer id;
    private String username;
    private Double money;
}
