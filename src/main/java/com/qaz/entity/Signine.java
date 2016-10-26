package com.qaz.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by innofin-04 on 2016/10/25.
 */
@Entity
public class Signine {
    @Id
    private String id;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    private String userId;
    private String passwd;

}
