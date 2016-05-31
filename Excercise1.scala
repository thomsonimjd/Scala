import test._
object Excercise1
{
	def main(arg:Array[String])
	{
		println("Excercise1.....")

		val x=10
		val y=20

		 val pt = new Point(1, 2)
   		 println(pt)
   		 pt.move(10, 10)
    		println(pt)
		println(x.toFloat)
		println(x.toDouble)
		println(x.toLong)

		val bj=new Bj
		bj.move(1,2)
	}

	class Point(xc: Int, yc: Int) 
	{
 		 var x: Int = xc
  		 var y: Int = yc
  		def move(dx: Int, dy: Int) 
		{
    				x = x + dx
    				y = y + dy
			println(x +"  "+y)
  		}
		//def Point(a:)
  		
	}
	class Bj()extends Point(1,2)
	{
		def getMove()
		{	
			println("ok")
		}
	}

	
	
}


	