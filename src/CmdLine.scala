
import java.io.{File, PrintWriter}
import java.time.{Clock, Instant, LocalDate, LocalDateTime, ZoneOffset, ZonedDateTime}
import java.util.{Calendar, Date, Objects}

import sys.process._
import scala.language.postfixOps


class CmdLine(){

  //val path = new File(".").getAbsolutePath() + "//Repository";
  val path = "/home/bartek/Desktop/commandExecuter/Repository";
  val timeChecker = new TimeChecker


  def configureGithub(): Unit ={
    val cmd2="git -C "+path+" config user.email theterabit@gmail.com"
    val cmd3="git -C "+path+" config user.email"
    val cmd4="git -C "+path+" remote add origin https://github.com/CommandLineApp/Repository.git"
    val cmd1="git -C "+path+" init"
    val cmd5 = "git -C "+path+" add ."
    val result = cmd1 #| cmd2 #| cmd3 #| cmd4 #| cmd5 !
  }

  def prepareDate(password: String): LocalDate = {
    val localDate = getDate()
    val dateCode = createDateCode(localDate)
    changeDate(password, dateCode)
    return localDate
  }
  def changeDate(password: String, dateCode: String): Unit = {
    val cmd1="echo "+ password
    val cmd = "sudo -S date +%Y%m%d -s \""+dateCode+"\""
    val cmd2 = "date"
    val result = cmd1 #| cmd !
  }
  def getDate(): LocalDate =
  {
    var local: LocalDate = LocalDate.now()
    local = local.minusYears(1)
    //local = local.plusMonths(1)

    while(!local.getDayOfWeek().toString.equals("SUNDAY")){
      local = local.plusDays(1)
    }
    print(local.getDayOfWeek)
    return local

  }
  def nextDate(password: String, currentDate: LocalDate): Unit = {
    val dateCode = createDateCode(currentDate)
    changeDate(password, dateCode)
  }

  def createDateCode(local: LocalDate): String = {
    var monthCode = local.getMonthValue.toString
    var dayCode = local.getDayOfMonth.toString
    if(monthCode.length<2)
      monthCode = "0" +monthCode
    if(dayCode.length<2)
      dayCode = "0" +dayCode
    return local.getYear.toString + monthCode + dayCode
  }

  def colorSquare(): Unit ={

    for(numberOfCommit <- 1 to timeChecker.getNumberOfCommits()){
      edit(numberOfCommit, timeChecker.getDate())
      commit()
    }
  }

  def edit(numberOfCommit: Int, date: String): Unit ={
    val writer = new PrintWriter(new File(path + "/file.txt"))
    writer.write(numberOfCommit+"_"+date)
    writer.close()
  }

  def commit(): Unit ={
    val path=new File(".").getAbsolutePath()+"/Repository ";
    val cmd="git -C "+path+"commit -m \"nazwaTestowa\" -a"
    val exitCode = cmd.!
  }



  def executeCommand(): Unit ={
    val path=new File(".").getAbsolutePath()+"\\Repository ";
    val cmd="git -C "+path+"status"
    val cmd2="git -C "+path+"config user.email theterabit@gmail.com"
    val cmd3="git -C "+path+"config user.email"
    val cmd6="git -C "+path+"remote add origin https://github.com/CommandLineApp/Repository.git"
    val cmd4="git -C "+path+"commit -m \"nazwaTestowa\" -a"
    val cmd5="git -C "+path+"push -u origin master"
    val cmd7="password"
    val exitCode = cmd.!
    val result = cmd2 #| cmd3 #| cmd6 #| cmd4 #| cmd5 #| cmd7!
  }



}