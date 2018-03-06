package com.plutusds.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "Customer")
public class Customer {
    private String id;
    private String firstName;
    private String lastName;


}
