package cn.edu.cqvie.ssm.common.entity;

import lombok.Data;

import java.util.Date;

/**
 * 系统用户
 *
 * @author zhengsh
 * @date 2020-10-22
 */
@Data
public class SysUser {

    private long id;

    private String username;

    private String password;

    private int age;

    private int sex;

    private String idCard;

    private String address;

    private Date birthday;
}
