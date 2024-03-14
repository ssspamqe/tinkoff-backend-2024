# Changelog

All notable changes to this project will be documented in this file.
## [0.5] - 2024-04-08

### Added
- Database migration files
- Liquibase in docker-compose file
- Sample PostgreSQL integration test

## [0.4] - 2024-03-08

### Added
- Rest api controllers
    - Bot rest controller
        - post /update - send update
    - Scrapper rest controller
        - post /tg-chat/{id} - register chat
        - delete /tg-chat/{id} - delete chat
        - get /links - get all tracked links(requires Tg-Chat-Id header)
        - post /links - add link for tracking (requires Tg-Chat-Id header)
        - delete /links - delete tracked link (requires Tg-Chat-Id header)
- Service and domain layers in Scrapper
    - Redis is being used for storing data
- Swagger-ui for api
- Web clients
    - Bot web client in scrapper
    - Scrapper web client in bot
 
### Changed
- Slash commands hierarchy
- Slash commands service layer was refactored 


## [0.3] - 2024-02-22

### Added
- Web clients
    - StackOverflow web client
        - Getting question by id
        - Getting answers by question id
    - GitHub web client
        - Getting repository by owner and repository name
        - Gettign repository activites by owner and repository name
  

## [0.2] - 2024-02-22

### Added   
- Bot skeleton
  - 5 slash commands
    - Track
    - Untrack
    - Help
    - List
    - Start
- Temporary Data storage 
