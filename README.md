To run application use command: mvn spring-boot:run Application will start on port 8080

Uses json

POST method to create application http://localhost:8080/api/application
-json example:
{
    "phoneNumber": "+37126000000",
    "email": "john.doe@klix.app",
    "monthlyIncome": 1000,
    "monthlyExpenses": 0,
    "dependents": 0,
    "agreeToDataSharing": true,
    "amount": 150,
    "maritalStatus": "SINGLE"
}

-return example:
{
    "Solid Bank": "ba70d5ef-05bd-4493-b397-f04107d42a14",
    "Fast Bank": "a2979ad2-1776-47ee-9baf-ce0625416702"
}



GET method to retrieve the offer http://localhost:8080/api/application
{
    "Solid Bank": "ba70d5ef-05bd-4493-b397-f04107d42a14",
    "Fast Bank": "a2979ad2-1776-47ee-9baf-ce0625416702"
}
