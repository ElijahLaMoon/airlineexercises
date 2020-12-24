package airdata
package models

case class Airport(
  airportId: Int,
  name: String,
  city: String,
  country: String,
  iata: Option[String],
  icao: Option[String],
  latitude: Double,
  longtitude: Double,
  altitude: Double,
  timezone: Double,
  dst: String,
  tzDatabaseTimeZone: String,
  airportType: String,
  source: String
)
