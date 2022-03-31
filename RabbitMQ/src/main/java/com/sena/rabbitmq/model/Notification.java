package com.sena.rabbitmq.model;

import java.io.Serializable;
import java.util.Date;

//must be serializable
public class Notification implements Serializable {
    private String notificationId;
    private Date createDate;
    private Boolean seen;
    private String message;

    @Override
    public String toString() {
        return "Notification{" +
                "notificationId='" + notificationId + '\'' +
                ", createDate=" + createDate +
                ", seen=" + seen +
                ", message='" + message + '\'' +
                '}';
    }

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Boolean getSeen() {
        return seen;
    }

    public void setSeen(Boolean seen) {
        this.seen = seen;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
