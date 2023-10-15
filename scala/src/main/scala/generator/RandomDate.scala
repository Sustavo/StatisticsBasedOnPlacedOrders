package generator

import java.time.LocalDate
import java.util.concurrent.ThreadLocalRandom

object RandomDate {
  val minDay: Long = LocalDate.of(2020,9,17).toEpochDay
  val maxDay: Long = LocalDate.now().toEpochDay

  def getRandomPlacedOrderDate: LocalDate = LocalDate.ofEpochDay(ThreadLocalRandom.current().nextLong(minDay,maxDay))
}
