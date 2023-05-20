package com.myorg;
import java.util.*;

public class Conf {
    
    public String prefix = "dev";
    
    // CDK Conf
    public String accountId = "080266302756";
    public String region    = "us-east-2";
    
    // Network Conf
    public String vpc_name = "ecs-vpc";
    public String vpc_cidr = "20.10.0.0/16";
    public String sg_name  = "ecservicesg";
    
    // Domain conf
    public String certificate = "arn:aws:acm:us-east-2:080266302756:certificate/eb608a53-9ba1-4948-b9ad-e142631b545f";
    public String zonename    = "abdelalitraining.com";
    public String zoneid      = "Z05045244G4M5OFGHB4C";
    public String recordname  = "springboot.abdelalitraining.com";
    public String loadbalancername = "ecsservice-nlb";
    public boolean stickness = false;
    
    
    // ECS Configuration
    public String clustername = "ecscluster";
    public String servicename = "springservice";
    public String taskname    = "springtask";
    public String ecr_repo = "080266302756.dkr.ecr.us-east-2.amazonaws.com/springapp";
    public int app_port    = 8080;
    public int desiredcount = 2;
    public String logstream = "springbootlogs";
    
    // DB Conf
    public String secretname = "rdssecret";
    public String rdsdb = "abdelali";
    public String rdsusername = "abdelali";
    public String rdsinstanceidentifier = "rdsinstance";
    
    // S3 bucket
    
    public String bucketname = "";
    
    
}
