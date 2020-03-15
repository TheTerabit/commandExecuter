import java.time.{LocalDate, LocalDateTime}

import scala.language.postfixOps
object App {

  val letterParser = new LetterParser()
  val cmdLine = new CmdLine()
  val timeChecker = new TimeChecker()


  def main(args: Array[String]): Unit ={
    print("Enter your caption: ")
    val caption = scala.io.StdIn.readLine().toUpperCase();//input
    print("Root password: ")
    val password = scala.io.StdIn.readLine();//input
    fillGithubHistory(letterParser.parseString(caption), password);//output
  }

  private def fillGithubHistory(githubSquares: List[Int], password: String): Unit ={
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
    val now = LocalDate.now()
    cmdLine.configureGithub();
    var currentDate = cmdLine.prepareDate(password)
    for (i <- githubSquares){
      print(i)
      if(i==1) {
        var numOfCommits = getNumberOfCommits(currentDate)
        println(numOfCommits)
        println("-------")
        for (j <- 0 until numOfCommits) {
          cmdLine.edit(j, cmdLine.createDateCode(currentDate))
          //updateFile()
          cmdLine.commit()
        }

      }
      currentDate = currentDate.plusDays(1)
      cmdLine.nextDate(password, currentDate)
    }

    cmdLine.nextDate(password, now)
    //cmdLine.configureGithub();
    //while(!timeChecker.sunday()){Thread.sleep(60000)}//wait until first Sunday//go to begining
    //goToFirstSquare()
    /*for(i<-githubSquares){
      //if(i==1)
        cmdLine.colorSquare()
      //moveDate()
      return;
    }

     */
  }

  private def getNumberOfCommits(date: LocalDate): Int ={
    println(date.getDayOfWeek.toString)
    val currentDay = date.getDayOfWeek.getValue
    if(currentDay==7 || currentDay==1)
      return 8
    else if(currentDay==2 || currentDay==3)
      return 6
    else if(currentDay==4 || currentDay==5)
      return 4
    else
      return 2

  }
}
