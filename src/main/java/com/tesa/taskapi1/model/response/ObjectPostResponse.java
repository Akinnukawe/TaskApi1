package com.tesa.taskapi1.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

class Data{
    public int year;
    public double price;
    @JsonProperty("CPU model")
    public String cpuModel;
    @JsonProperty("Hard disk size")
    public String hardDiskSize;
}

public class ObjectPostResponse{
    public String id;
    public String name;
    public Date createdAt;
    public Data data;
}
