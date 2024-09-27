# Overview

This project is a Spring Boot CRUD application designed to manage trainer job notifications. It provides a RESTful API for creating, retrieving, and fetching job notifications by their job ID. The application uses an in-memory H2 database to perform basic CRUD operations.

## Core Components
  1. JobNotification Model: Defines the structure of a job notification with attributes such as jobId, jobTitle, description, location, and salary.
  2. JobNotificationService: Contains business logic for managing job notifications, including adding new jobs, retrieving all jobs, and searching by jobId.
  3. JobRepository: Interface that extends Spring’s JpaRepository for CRUD operations with job notifications.
  4. JobNotificationController: Exposes RESTful endpoints for creating and fetching job notifications.

## Features

  * POST /jobs: Add a new job notification.
  * GET /jobs: Retrieve a list of all job notifications.
  * GET /jobs/{id}: Fetch a specific job notification by jobId.
  * DELETE /jobs/{id}: Remove a job notification by its jobId.


