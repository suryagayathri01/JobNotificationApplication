# Learning Outcomes
In this project, I implemented a Spring Boot-based CRUD application to manage job notifications for trainers. The system allows users to create, view, and delete job notifications via RESTful API endpoints. The key components of the project include a JobNotification model, a JobNotificationService class for business logic, a JobRepository for database interactions, and a JobNotificationController to expose RESTful APIs. MySQL database was used for testing the CRUD operations.

## Implementation of CRUD Operations
  ### 1 Model:JobNotification
  The JobNotification class represents the entity used in the system. It defines fields such as jobId, jobTitle, description, location, and salary. 
  ### 2 Controller: JobNotificationController
  The JobNotificationController class is the entry point for the API. It exposes endpoints for CRUD operations, allowing users to interact with the system.

* POST /jobs: Adds a new job notification.
* GET /jobs: Retrieves all job notifications.
* GET /jobs/{id}: Retrieves a job notification by jobId.
* DELETE /jobs/{id} (Optional): Deletes a job notification by jobId.

  ### Service: JobNotificationService
  The JobNotificationService class contains the business logic for managing job notifications. It uses the repository to perform database operations. The key methods include:

* addJobNotification: Adds a new job notification to the database.
* getAllJobNotifications: Retrieves all job notifications from the database.
* getJobNotificationById: Fetches a specific job notification based on the jobId.

  
  
  
