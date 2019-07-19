import scala.language.postfixOps
object App {

  val letterParser = new LetterParser()
  val cmdLine = new CmdLine()
  val timeChecker = new TimeChecker()


  def main(args: Array[String]): Unit ={
    val caption = scala.io.StdIn.readLine().toUpperCase();//input
    fillGithubHistory(letterParser.parseString(caption));//output
  }

  private def fillGithubHistory(githubSquares: List[Int]): Unit ={
      /*//print
      var counter=0
      for(i<-githubSquares){
        if(i==1)
          print(219.toChar)
        else
          print(' ')
        counter=(counter+1)%7
        if(counter==0)
          println
      }
       */

    cmdLine.configureGithub();
    while(!timeChecker.sunday()){Thread.sleep(60000)}//wait until first Sunday
    for(i<-githubSquares){
      if(i==1)
        cmdLine.colorSquare()
        do {Thread.sleep(60000)} while(!timeChecker.newDay())
    }
  }

}
