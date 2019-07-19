
import java.io.{File, PrintWriter}

import sys.process._
import scala.language.postfixOps


class CmdLine(){

  val path = new File(".").getAbsolutePath() + "\\Repository";
  val timeChecker = new TimeChecker


  def configureGithub(): Unit ={
    val cmd1="git -C " + path + " config user.email theterabit@gmail.com"
    val cmd2="git -C " + path + " config user.email"
    val cmd3="git -C " + path + " remote add origin https://github.com/CommandLineApp/Repository.git"
    val result = cmd1 #| cmd2 #| cmd3 !
  }


  def colorSquare(): Unit ={
    for(numberOfCommit <- 1 to timeChecker.getNumberOfCommits()){
      edit(numberOfCommit, timeChecker.getDate())
      commit()
    }
  }

  private def edit(numberOfCommit: Int, date: String): Unit ={
    val writer = new PrintWriter(new File(path + "\\file.txt"))
    writer.write(numberOfCommit+"_"+date)
    writer.close()
  }

  private def commit(): Unit ={
    println("commited")
  }


/*
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

 */

}