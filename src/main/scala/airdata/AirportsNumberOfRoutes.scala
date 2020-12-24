package airdata

import MockData._

object AirportsNumberOfRoutes extends App {
  val airportsWithNumberOfFlights = airports.flatMap { airport => 
    val aId = airport.airportId

    List(
      (airport, routes.count { route =>
        route.sourceAirportId == aId ||
          route.destinationAirportId == aId
      })
    )
  }

  val largestNumberOfFlights = airportsWithNumberOfFlights.maxBy(_._2)
  val lowestNumberOfFlights = airportsWithNumberOfFlights.minBy(_._2)

  println(s"Airport with the largest number of flights is ${largestNumberOfFlights._1.name} with ${largestNumberOfFlights._2} flights")
  println(s"Airport with the lowest number of flights is ${lowestNumberOfFlights._1.name} with ${lowestNumberOfFlights._2} flights")
}
