package generator

import java.time.LocalDate
import java.util.concurrent.ThreadLocalRandom

object RandomDate {
  val minDay: Long = LocalDate.of(2020,9,17).toEpochDay
  val maxDay: Long = LocalDate.now().toEpochDay

  def getRandomPlacedOrderDate:LocalDate = {
      val randomDay: Long = ThreadLocalRandom.current().nextLong(minDay,maxDay);
      LocalDate.ofEpochDay(randomDay)
  }

}
