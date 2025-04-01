package starter.lib

import munit.CatsEffectSuite

class LibTest extends CatsEffectSuite:
  test("Say hello to the world"):
    assertEquals(Lib.hello("World"), "Hello World!")
