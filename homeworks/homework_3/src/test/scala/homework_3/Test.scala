package homework_3

import utest._

object Test extends TestSuite{
    val trueStr = "правда"
    val falseStr = "ложь"

    val tests = Tests{
        'test_prettyBooleanFormatter1 - {
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter1(List(1, 2, List(1, 2))) == "List(1, 2, List(1, 2)))")
            assert(Exercises.prettyBooleanFormatter1(Seq(1, 2, 3)) == "List(1, 2, 3)")
            assert(Exercises.prettyBooleanFormatter1("aaaaaaaaaa") == "aaaaaaaaaa")
        }
        'test_prettyBooleanFormatter2 - {
            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter2(List(1, 2, List(1, 2))) == "List(1, 2, List(1, 2)))")
            assert(Exercises.prettyBooleanFormatter2(Seq(1, 2, 3)) == "List(1, 2, 3)")
            assert(Exercises.prettyBooleanFormatter2("aaaaaaaaaa") == "aaaaaaaaaa")
        }
        'test_prettyBooleanFormatter3 - {
            assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter3(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter3(List(1, 2, List(1, 2))) == "List(1, 2, List(1, 2)))")
            assert(Exercises.prettyBooleanFormatter3(Seq(1, 2, 3)) == "List(1, 2, 3)")
            assert(Exercises.prettyBooleanFormatter3("aaaaaaaaaa") == "aaaaaaaaaa")
        }
        'test_max1 - {
            intercept[IllegalArgumentException]{Exercises.max1(Seq.empty[Int])}
            assert(Exercises.max1(Seq(1, 1, 1)) == 1)
            assert(Exercises.max1(Seq(1, 5, 15, -5)) == 15)
            assert(Exercises.max1(Seq(-1, -2, -3)) == -1)
            assert(Exercises.max1(Seq(-1, 14, 10, 0)) == 14)
        }
        'test_max2 - {
            assert(Exercises.max2(Seq.empty[Int]) == Seq.empty[Int])
            assert(Exercises.max2(Seq(1, 1, 1)) == Seq(1))
            assert(Exercises.max2(Seq(1, 5, 15, -5)) == Seq(15))
            assert(Exercises.max2(Seq(-1, -2, -3)) == Seq(-1))
            assert(Exercises.max2(Seq(-1, 14, 10, 0)) == Seq(14))
        }
        'test_max3 - {
            assert(Exercises.max3(Seq()) == None)
            assert(Exercises.max3(Seq(1, 1, 1)) == Option(1))
            assert(Exercises.max3(Seq(1, 5, 15, -5)) == Option(15))
            assert(Exercises.max3(Seq(-1, -2, -3)) == Option(-1))
            assert(Exercises.max3(Seq(-1, 14, 10, 0)) == Option(14))
        }
        'test_sum1 - {
            assert(Exercises.sum1(1, 5) == 6)
            assert(Exercises.sum1(-11, 111) == 100)
            assert(Exercises.sum1(15, 5) == 20)
            assert(Exercises.sum1(22, 422) == 444)
        }
        'test_sum2 - {
            assert(Exercises.sum2(1, 5) == 6)
            assert(Exercises.sum2(-11, 111) == 100)
            assert(Exercises.sum2(15, 5) == 20)
            assert(Exercises.sum2(22, 422) == 444)
        }
        'test_sum3 - {
            assert(Exercises.sum3(1, 5) == 6)
            assert(Exercises.sum3(-11, 111) == 100)
            assert(Exercises.sum3(15, 5) == 20)
            assert(Exercises.sum3(22, 422) == 444)
        }
    }
}
