package mesosphere.marathon
package core.condition

import mesosphere.UnitTest

class ConditionTest extends UnitTest {

  "A Condition" when {
    "staging" should {
      val condition = Condition.Staging
      "be active" in { condition.isActive should be(true) }
      "not be terminal" in { condition.isTerminal should be(false) }
    }

    "starting" should {
      val condition = Condition.Starting
      "be active" in { condition.isActive should be(true) }
      "not be terminal" in { condition.isTerminal should be(false) }
    }

    "running" should {
      val condition = Condition.Running
      "be active" in { condition.isActive should be(true) }
      "not be terminal" in { condition.isTerminal should be(false) }
    }

    "unreachable" should {
      val condition = Condition.Unreachable
      "be active" in { condition.isActive should be(true) }
      "not be terminal" in { condition.isTerminal should be(false) }
    }

    "killing" should {
      val condition = Condition.Killing
      "be active" in { condition.isActive should be(true) }
      "not be terminal" in { condition.isTerminal should be(false) }
    }

    "created" should {
      val condition = Condition.Created
      "be active" in { condition.isActive should be(true) }
      "not be terminal" in { condition.isTerminal should be(false) }
    }

    "failed" should {
      val condition = Condition.Failed
      "not be active" in { condition.isActive should be(false) }
      "be terminal" in { condition.isTerminal should be(true) }
    }

    "gone" should {
      val condition = Condition.Gone
      "not be active" in { condition.isActive should be(false) }
      "be terminal" in { condition.isTerminal should be(true) }
    }

    "killed" should {
      val condition = Condition.Killed
      "not be active" in { condition.isActive should be(false) }
      "be terminal" in { condition.isTerminal should be(true) }
    }

    "finished" should {
      val condition = Condition.Finished
      "not be active" in { condition.isActive should be(false) }
      "be terminal" in { condition.isTerminal should be(true) }
    }

    "dropped" should {
      val condition = Condition.Dropped
      "not be active" in { condition.isActive should be(false) }
      "be terminal" in { condition.isTerminal should be(true) }
    }
  }
}
