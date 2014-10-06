package global

import play.api._
import scala.Boolean
import java.io.File
import neo4j.services.Neo4JServiceProvider

object Global extends GlobalSettings {
  private var app: Application = null

  override def onStart(app: Application) = {
    this.app = app
  }

  def config(): Configuration = app.configuration

  def isDev: Boolean = Play.isDev(app)
}