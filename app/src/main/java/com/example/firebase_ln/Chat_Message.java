package com.example.firebase_ln;

import java.util.Date;

public class Chat_Message
{
    private String messageText;
    private String messageUser;
    private long messageTime;

    public Chat_Message(String messageText, String messageUser) {
        this.messageText = messageText;
        this.messageUser = messageUser;

        // Initialize to current time
        messageTime = new Date().getTime();
    }

    public Chat_Message()
    {

    }

    public String getMessageText()
    {
        return messageText;
    }

    public void setMessageText(String messageText)
    {
        this.messageText = messageText;
    }

    public String getMessageUser()
    {
        return messageUser;
    }

    public void setMessageUser(String messageUser)
    {
        this.messageUser = messageUser;
    }

    public long getMessageTime()
    {
        return messageTime;
    }

    public void setMessageTime(long messageTime)
    {
        this.messageTime = messageTime;
    }

}
