# gs-accessing-mongodb-data-rest

please refer to http://projects.spring.io/spring-data-rest/

## Build & development

start mongodb server
>`mongod -dbpath ./data
>`run Application.java`

## Client Access
1. use Chrome App: Postman 
/persons{?page,size,sort}		GET
(µ»”⁄ƒ¨»œ£∫?page=0&size=20)	

/persons/						POST	Content-Type: application/json
{
°∞firstName°±: °∞QiZhong°±,
°∞lastName°±: °∞Lin°±,
°∞age°±: 36
}	

/persons/{id}					GET

/persons/{id}					PUT	Content-Type: application/json
{
°∞firstName°±: °∞QiZhong Jr.°±,
°∞lastName°±: °∞Lin°±,
°∞age°±: 3
}	

/persons/{id}					PATCH	Content-Type: application/json
{
°∞firstName°±: °∞QiZhong Jr.°±
}	

/persons/{id}					DELETE	

/persons/search/findByLastName?name={name}	GET	


2. use browser via HAL (hypertext application language)
localhost:8080/

