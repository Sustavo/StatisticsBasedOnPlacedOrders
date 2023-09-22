package validator

import java.time.LocalDate
import java.time.format.{DateTimeFormatter, DateTimeParseException}

object Validator {
  def ValidateParameters(startDate: LocalDate, endDate: LocalDate)= {
  }

  def incorrectDates(startDate: String, endDate: String): Boolean = {
    try {
      val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
      val start = LocalDate.parse(startDate, formatter)
      val end = LocalDate.parse(endDate, formatter)

      if (start.isAfter(end)) {
        println("The start date cannot be later than the end date.")
        return true
      }

      false
    } catch {
      case e: DateTimeParseException => {
        println("An error occurred when trying to use the arguments passed.\nit is necessary to pass using the format: \"YYYY-MM-DD\"")
        true
      }
    }
  }

  def EndIsBiggerThanStart(start: Int, end: Int): Boolean = {
    if(end > start) {
      true
    } else {
      throw new IllegalArgumentException("The value of 'end' must be greater than 'start'.");
    }
  }


}
