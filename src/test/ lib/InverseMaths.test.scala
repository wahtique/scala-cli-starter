package starter.lib

class InverseMathsTest extends munit.FunSuite:
  test("2 3 + retourne 5"):
    assertEquals(InverseMaths.parse("2 3 +"), 5)

  test("8 4 3 + - 5 + retourne 6"):
    assertEquals(InverseMaths.parse("8 4 3 + - 5 +"), 6)
