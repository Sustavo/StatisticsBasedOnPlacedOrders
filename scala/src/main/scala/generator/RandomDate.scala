package generator

import java.time.format.DateTimeFormatter
import java.time.{LocalDate, LocalDateTime, ZoneOffset}
import java.util.concurrent.ThreadLocalRandom

object RandomDate {
  val minDay: Long = LocalDate.of(2020, 9, 17).toEpochDay
  val maxDay: Long = LocalDate.now().toEpochDay
  val secondsInADay: Long = 86400

  def getRandomPlacedOrderTime: String = {
    val randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay)
    val randomTime = ThreadLocalRandom.current().nextLong(0, secondsInADay)
    val randomDateTime = LocalDateTime.ofEpochSecond(randomDay * secondsInADay + randomTime, 0, ZoneOffset.UTC)
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
    val formattedDateTime = randomDateTime.format(formatter)
    formattedDateTime
  }

}
