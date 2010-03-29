package controllers

import play._
import play.mvc._
import java.text.SimpleDateFormat
import java.util.{Calendar, Date}

object Application extends Controller {

  val dateFormat = new SimpleDateFormat("dd.MM.yyyy")

  def index() {
    val date = dateFormat.format(new Date())
    render(date)
  }

  def calculate(date: String, extraDays: Int){
    val calendar = Calendar.getInstance()
    calendar.setTime(new SimpleDateFormat("MM/dd/yyyy").parse(date))
    calendar.add(Calendar.DATE, extraDays)

    Logger.info(dateFormat.format(calendar.getTime))
    
  }

}
