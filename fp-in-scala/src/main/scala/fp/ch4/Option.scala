package fp.ch4

sealed trait Option[+A] {
  def map[B](f: A ⇒ B): Option[B] = this match {
    case Some(x) ⇒ Some(f(x))
    case None    ⇒ None
  }
  def orElse[B >: A](ob: ⇒ Option[B]): Option[B] = this match {
    case Some(x) ⇒ this
    case None    ⇒ ob
  }

  /* The following combinators are defined both with
   * and without resorting to pattern matching. */
  def flatMapPM[B](f: A ⇒ Option[B]): Option[B] = this match {
    case Some(x) ⇒ f(x)
    case None    ⇒ None
  }
  def flatMap[B](f: A ⇒ Option[B]): Option[B] = ???

}

case class  Some[+A](get: A) extends Option[A]
case object None             extends Option[Nothing]


