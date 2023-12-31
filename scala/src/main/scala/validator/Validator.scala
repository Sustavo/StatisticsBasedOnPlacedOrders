package validator

import java.time.LocalDate
import java.time.format.{DateTimeFormatter, DateTimeParseException}

object Validator {
  def validateParameters(args: Array[String])= {
    if(args.length != 2) {
      throw new IllegalArgumentException("you need to enter two dates:\n" +
        "Start Date and End Date");
    }
    false

  }

  def incorrectDates(args: Array[String]): Boolean = {
    try {
      val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
      val start = LocalDate.parse(args(0), formatter)
      val end = LocalDate.parse(args(1), formatter)

      if (start.isAfter(end)) {
        throw new IllegalArgumentException("The start date cannot be later than the end date.")
        return true
      }

      false
    } catch {
      case e: DateTimeParseException => {
        println("An error occurred when trying to use the arguments passed.\nit is necessary to use the format: \"YYYY-MM-DD\"")
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
