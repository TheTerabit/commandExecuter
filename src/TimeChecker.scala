import java.util.Calendar

class TimeChecker {

  def newDay(): Boolean ={
    val now = Calendar.getInstance()
    val currentMinute = now.get(Calendar.MINUTE)
    val currentHour = now.get(Calendar.HOUR_OF_DAY)
    println(currentHour+":"+currentMinute)

    if(currentMinute%3==0 && currentHour==17)
      return true
    else
      return false
  }

  def sunday(): Boolean ={
    val now = Calendar.getInstance()
    val currentDay = now.get(Calendar.DAY_OF_WEEK)//1 = Sunday

    if(newDay() && currentDay==2)
      return true
    else
      return false
  }

  def getNumberOfCommits(): Int ={
    val now = Calendar.getInstance()
    val currentDay = now.get(Calendar.DAY_OF_WEEK)
    return (10-currentDay)/2
  }

  def getDate(): String ={
    val now = Calendar.getInstance()
    val currentMonth = now.get(Calendar.MONTH)
    val currentDay = now.get(Calendar.DAY_OF_MONTH)
    return currentMonth + "/" + currentDay
  }
}
