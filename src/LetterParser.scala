class LetterParser {

       def parseString(caption:String):List[Int]={
            var drawnLetters = List[Int]()
            for (i <- caption) {
                   drawnLetters = drawnLetters:::(parseLetter(i)):::(List(0, 0, 0, 0, 0, 0, 0))
            }

            return drawnLetters
      }

       private def parseLetter(letter:Char): List[Int] ={
            if(letter=='A')
              return List(0,1,1,1,1,1,1, 1,0,0,1,0,0,0, 1,0,0,1,0,0,0, 0,1,1,1,1,1,1)
            if(letter=='B')
              return List(1,1,1,1,1,1,1, 1,0,0,1,0,0,1, 1,0,0,1,0,0,1, 0,1,1,0,1,1,0)
            if(letter=='C')
              return List(0,1,1,1,1,1,0, 1,0,0,0,0,0,1, 1,0,0,0,0,0,1, 1,0,0,0,0,0,1)
            if(letter=='D')
              return List(1,1,1,1,1,1,1, 1,0,0,0,0,0,1, 1,0,0,0,0,0,1, 0,1,1,1,1,1,0)
            if(letter=='E')
              return List(1,1,1,1,1,1,1, 1,0,0,1,0,0,1, 1,0,0,1,0,0,1, 1,0,0,1,0,0,1)
            if(letter=='F')
              return List(1,1,1,1,1,1,1, 1,0,0,1,0,0,0, 1,0,0,1,0,0,0, 1,0,0,1,0,0,0)
            if(letter=='G')
              return List(0,1,1,1,1,1,0, 1,0,0,0,0,0,1, 1,0,0,1,0,0,1, 1,0,0,1,1,1,0)
            if(letter=='H')
              return List(1,1,1,1,1,1,1, 0,0,0,1,0,0,0, 0,0,0,1,0,0,0, 1,1,1,1,1,1,1)
            if(letter=='I')
              return List(1,1,1,1,1,1,1)
            if(letter=='J')
              return List(1,0,0,0,0,0,1, 1,0,0,0,0,0,1, 1,1,1,1,1,1,0)
            if(letter=='K')
              return List(1,1,1,1,1,1,1, 0,0,0,1,0,0,0, 0,0,1,0,1,0,0, 1,1,0,0,0,1,1)
            if(letter=='L')
              return List(1,1,1,1,1,1,1, 0,0,0,0,0,0,1, 0,0,0,0,0,0,1, 0,0,0,0,0,0,1)
            if(letter=='L')
              return List(1,1,1,1,1,1,1, 0,0,0,0,0,0,1, 0,0,0,0,0,0,1, 0,0,0,0,0,0,1)
            if(letter=='M')
              return List(1,1,1,1,1,1,1, 0,1,1,0,0,0,0, 0,0,1,1,0,0,0, 0,1,1,0,0,0,0, 1,1,1,1,1,1,1)
            if(letter=='N')
              return List(1,1,1,1,1,1,1, 0,1,1,1,0,0,0, 0,0,0,1,1,1,0, 1,1,1,1,1,1,1)
            if(letter=='O')
              return List(0,1,1,1,1,1,0, 1,0,0,0,0,0,1, 1,0,0,0,0,0,1, 0,1,1,1,1,1,0)
            if(letter=='P')
              return List(1,1,1,1,1,1,1, 1,0,0,1,0,0,0, 1,0,0,1,0,0,0, 0,1,1,0,0,0,0)
            if(letter=='R')
              return List(1,1,1,1,1,1,1, 1,0,0,1,0,0,0, 1,0,0,1,0,0,0, 0,1,1,0,1,1,1)
            if(letter=='S')
              return List(0,1,1,0,0,0,1, 1,0,0,1,0,0,1, 1,0,0,1,0,0,1, 1,0,0,0,1,1,0)
            if(letter=='T')
              return List(1,0,0,0,0,0,0, 1,0,0,0,0,0,0, 1,1,1,1,1,1,1, 1,0,0,0,0,0,0, 1,0,0,0,0,0,0)
            if(letter=='U')
              return List(1,1,1,1,1,1,0, 0,0,0,0,0,0,1, 0,0,0,0,0,0,1, 1,1,1,1,1,1,0)
            if(letter=='W')
              return List(1,1,1,1,1,1,1, 0,0,0,0,1,1,0, 0,0,0,1,1,0,0, 0,0,0,0,1,1,0, 1,1,1,1,1,1,1)
            if(letter=='Y')
              return List(1,0,0,0,0,0,0, 0,1,0,0,0,0,0, 0,0,1,1,1,1,1, 0,1,0,0,0,0,0, 1,0,0,0,0,0,0)
            if(letter=='Z')
              return List(1,0,0,0,1,1,1, 1,0,0,1,0,0,1, 1,0,1,0,0,0,1, 1,1,0,0,0,0,1)
            else
              return List(0,0,0,0,0,0,0, 0,0,0,0,0,0,0)//space

  }
}
