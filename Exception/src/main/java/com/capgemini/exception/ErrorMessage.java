package com.capgemini.exception;
public class ErrorMessage
{
    private int status;
    private String message;
    
    public ErrorMessage()
    {
        super();
    }
    public ErrorMessage(int status, String message)
    {
        super();
        this.status = status;
        this.message = message;
    }
    
    public int getStatus()
    {
        return status;
    }
    public void setStatus(int status)
    {
        this.status = status;
    }
    public String getMessage()
    {
        return message;
    }
    public void setMessage(String message)
    {
        this.message = message;
    }
    @Override
    public String toString()
    {
        return "ErrorResponse [status=" + status + ", message=" + message + "]";
    }
}
