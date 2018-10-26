package com.example.avrad.mychatbot.Model;

public class SimsimiModel {
    public String response;
    public String id;
    public int result;
    public String msg;

    public SimsimiModel(String response, String id, int result, String msg)
    {
        this.response=response;
        this.id=id;
        this.result=result;
        this.msg=msg;
    }

    public SimsimiModel()
    {
    }

    public String getResponse() {
        return response;
    }

    public String getId() {
        return id;
    }

    public int getResult() {
        return result;
    }

    public String getMsg() {
        return msg;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
