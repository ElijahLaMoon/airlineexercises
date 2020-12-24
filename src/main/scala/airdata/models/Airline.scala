package airdata
package models

case class Airline(
  airlineId: Int,
  name: String,
  alias: Option[String],
  iata: Option[String],
  icao: Option[String],
  callsign: String,
  country: String,
  active: String
)
