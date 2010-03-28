package controllers

import play._
import play.mvc._
import java.text.SimpleDateFormat
import java.util.Date

object Application extends Controller {

  def index() {
    val today = new SimpleDateFormat("dd.MM.yyyy").format(new Date())
    render(today)
  }

  def calculate = render()
    
}
