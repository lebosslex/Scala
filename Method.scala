@main def Methode() = {

/*def getStackTraceAsString(t: Throwable): String =
    val sw = new StringWriter
    t.printStackTrace(new PrinterWrite(sw))
    sw.toString() */

def makeConnection(url: String, timeout: Int = 5000): Unit=
    println(s"url $url, timeout=$timeout") 


makeConnection(
    url = "https://localhost",
    timeout = 2500
)
engage(true, true, true, false)
}