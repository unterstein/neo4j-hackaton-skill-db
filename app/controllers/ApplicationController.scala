package controllers

import play.api._
import play.api.mvc._

object ApplicationController extends Controller {

  def index = Neo4jTransactionAction {
    implicit request =>
      Ok(views.html.index())
  }
}