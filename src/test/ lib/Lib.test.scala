package starter.lib

class LibTest extends munit.FunSuite:
  test("Say hello to the world"):
    assertEquals(Lib.hello("World"), "Hello World!")
