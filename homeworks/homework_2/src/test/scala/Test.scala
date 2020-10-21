import utest._
import Exercises.Vector2D

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
        'sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 3) == 3)
            assert(Exercises.sumOfDivBy3Or5(11, 16) == 27)
            assert(Exercises.sumOfDivBy3Or5(1, 100) == 2418)
        }
        'primeFactor - {
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(3) == Seq(3))
            assert(Exercises.primeFactor(235) == Seq(5, 47))
        }
        'sumByFunc - {
            assert(Exercises.sumScalars(Vector2D(3, 5), Vector2D(1, 3), Vector2D(4, 10), Vector2D(3, 5)) == 80)
            assert(Exercises.sumScalars(Vector2D(0, 0), Vector2D(0, 0), Vector2D(0, 0), Vector2D(0, 0)) == 0)
            assert(Exercises.sumCosines(Vector2D(2, 2), Vector2D(2, 2), Vector2D(3, 2), Vector2D(3, 2)) == 2)
        }
        'sortByHeavyweight - {
            val balls = Map("Aluminum" -> (3, 2.6889), "Cobalt" -> (4, 8.90))
            assert(Exercises.sortByHeavyweight(balls) == Seq("Aluminum", "Cobalt"))
            val balls1 = Map("Aluminum" -> (3, 2.6889), "Tin" -> (1, 7.29), "Silver" -> (4, 4.505))
            assert(Exercises.sortByHeavyweight(balls1) == Seq("Tin", "Aluminum", "Silver"))
        }
    }
}
