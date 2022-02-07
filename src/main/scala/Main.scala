import com.slack.api.bolt.App
import com.slack.api.bolt.jetty.SlackAppServer

// If you use bolt-jakarta-jetty, you can import `com.slack.api.bolt.jakarta_jetty.SlackAppServer` instead
object MyMain {
    private[this] val app = new App()

    app.command("/hello", (req, ctx) => ctx.ack(":wave: Hello!"))

    private[this] val server = new SlackAppServer(app)

    def main(args: Array[String]): Unit = {
      server.start()
  }
}
