package com.akkademy

import org.scalatest.{FunSpecLike,BeforeAndAfterEach,Matchers}
import akka.actor.ActorSystem
import akka.testkit.TestActorRef
import com.akkademy.messages.SetRequest

class AkkademyDbSpec extends FunSpecLike with Matchers with BeforeAndAfterEach{
  implicit val system=ActorSystem();
  describe("akkdemyDb"){
    describe("given SetRequest"){
      it("should place key/value into map"){
        val actorRef=TestActorRef(new AkkademyDb)
        actorRef ! SetRequest("key","value")
        val akkademyDb=actorRef.underlyingActor
        akkademyDb.map.get("key") should equal("value")
      }
    }
  }
}