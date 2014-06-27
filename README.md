filtering
=========

This example demonstrates using filters on the incoming message. It employs AND, Message property, Payload and Custom Filter

Step 1: import and run mule app
Step 2: use postman to make a POST http request using following json data

{
 "premium": false,
 "months": 12,
 "purchases": 1500
}

Step 3: Success: the response says:
        the discount was granted.
        
feel free to modify input parameters. if you input data that do not hold to filtering, a processing of the message is halted and no response is returned = this is the purpose of filtering.
