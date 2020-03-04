# BusReservation
Run these rest Url to check the program

Get
localhost:8080/busdetails
localhost:8080/busdetails/Volvo
localhost:8080/busdetail/1
localhost:8080/searchDetails
localhost:8080/search/1

Post
localhost:8080/busdetail
{
        "id": 3,
        "travelsName": "SRM",
        "busNo": "bus03",
        "busName": "Benz",
        "totalSeats": 35,
        "availSeats": 25,
        "farePrice": 800.0,
        "currentDate": "2020-02-02T18:30:00.000+0000",
        "selectSeat": 4
 }
localhost:8080/search
{
    "searchId": 2,
    "sourceCityName": "chennai",
    "destinationCityName": "Madurai",
    "travelDate": "2020-03-15T18:30:00.000+0000",
    "retrunDate": "2020-03-19T18:30:00.000+0000",
    "busTravelsName": "KPN"
}
