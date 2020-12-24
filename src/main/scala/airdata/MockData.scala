package airdata

import airdata.models._

object MockData {
  val airports = List(
    Airport(
      507,
      "London Heathrow Airport",
      "London",
      "United Kingdom",
      Option("LHR"),
      Option("EGLL"),
      51.4706,
      -0.461941,
      83,
      0,
      "E",
      "Europe/London",
      "airport",
      "OurAirports"
    ),
    Airport(
      26,
      "Kugaaruk Airport",
      "Pelly Bay",
      "Canada",
      Option("YBB"),
      Option("CYBB"),
      68.534401,
      -89.808098,
      56,
      -7,
      "A",
      "America/Edmonton",
      "airport",
      "OurAirports"
    ),
    Airport(
      3127,
      "Pokhara Airport",
      "Pokhara",
      "Nepal",
      Option("PKR"),
      Option("VNPK"),
      28.200899124145508,
      83.98210144042969,
      2712,
      5.75,
      "N",
      "Asia/Katmandu",
      "airport",
      "OurAirports"
    ),
    Airport(
      8810,
      "Hamburg Hbf",
      "Hamburg",
      "Germany",
      Option("ZMB"),
      None,
      53.552776,
      10.006683,
      30,
      1,
      "E",
      "Europe/Berlin",
      "station",
      "User"
    )
  )

  val airlines = List(
    Airline(
      324,
      "All Nippon Airways",
      Option("ANA All Nippon Airways"),
      Option("NH"),
      Option("ANA"),
      "ALL NIPPON",
      "Japan",
      "Y"
    ),
    Airline(
      412,
      "Aerolineas Argentinas",
      None,
      Option("AR"),
      Option("ARG"),
      "ARGENTINA",
      "Argentina",
      "Y"
    ),
    Airline(
      413,
      "Arrowhead Airways",
      None,
      Option(""),
      Option("ARH"),
      "ARROWHEAD",
      "United States",
      "N"
    )
  )

  val routes = List(
    Route(
      "BA",
      1355,
      "SIN",
      3316,
      "LHR",
      507,
      None,
      0,
      "744 777"
    ),
    Route(
      "BA",
      1355,
      "SIN",
      3316,
      "MEL",
      3339,
      Option("Y"),
      0,
      "744"
    ),
    Route(
      "TOM",
      5013,
      "ACE",
      1055,
      "BFS",
      465,
      None,
      0,
      "320"
    )
  )
}
