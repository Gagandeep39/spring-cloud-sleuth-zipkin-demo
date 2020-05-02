# Spring Sleuth 
- Used for Logging
- Helps us understand exactly which service or request has caused an error
- USes Trace and Span ID
1. Trace ID - Common for a request
2. Span ID - CHanges for change in microservice
Sample Log of Portal Servivce 
```
2020-05-02 17:45:49.360  INFO [doctor-portal,2bab3210f7517ebe,2bab3210f7517ebe,false] 15056 --- [nio-7081-exec-5] c.g.s.controller.DoctorPortalController  : Going to call doctors service
```

Sample Log of Log Sleuth  in Doctor Service
```
2020-05-02 17:45:49.375  INFO [doctor-service,2bab3210f7517ebe,e73a1aa96386a0e1,false] 21192 --- [nio-9081-exec-2] c.g.s.controller.DoctorController        : got hit on /allDoctors/Apollo
```
Sample Log in Notification Service 
```
2020-05-02 17:45:49.391  INFO [notification-service,2bab3210f7517ebe,3889c876550da22d,false] 15564 --- [nio-5081-exec-6] c.g.s.controller.NotificationController  : notified user for enquiry of - doctors
```
- 2bab3210f7517ebe - Trace ID (Same for 3 service as its a part of a common request)
- e73a1aa96386a0e1 - Span ID
- false - represents whether logs are exported