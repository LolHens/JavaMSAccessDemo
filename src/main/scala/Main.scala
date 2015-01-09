import java.sql.DriverManager

/**
 * Created by LolHens on 08.12.2014.
 */
object Main {
  def main(args: Array[String]): Unit = {
    aktualisiereTabelle()
  }

  def aktualisiereTabelle() = {
    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver")
    val connection = DriverManager.getConnection("jdbc:ucanaccess://e:/Melvin-Pierre.mdb");
    val rs = connection.createStatement().executeQuery("SELECT * FROM Schueler")
    while (rs.next()) println(s"${rs.getString(2)} ${rs.getString(3)}")
  }
}
