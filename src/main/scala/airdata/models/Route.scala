package airdata
package models

case class Route(
  airline: String,
  airlineId: Int,
  sourceAirport: String,
  sourceAirportId: Int,
  destinationAirport: String,
  destinationAirportId: Int,
  codeshare: Option[String],
  stops: Int,
  equipment: String
)
