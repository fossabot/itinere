package itinere

import cats.Invariant
import cats.data.NonEmptyList
import shapeless.CNil

trait JsonAlgebra[F[_]] extends JsonAlgebraFormatN[F] with Invariant[F] with Partial[F] with CoCartesian[F] {
  def int(bound: Range): F[Int]
  def float(bound: Range): F[Float]
  def double(bound: Range): F[Double]
  def long(bound: Range): F[Long]
  def string(description: StringDescriptor): F[String]
  val bool: F[Boolean]
  val cnil: F[CNil]
  def option[A](from: F[A]): F[Option[A]]
  def list[A](of: F[A]): F[List[A]]
  def set[A](of: F[A]): F[Set[A]]
  def vector[A](of: F[A]): F[Vector[A]]
  def seq[A](of: F[A]): F[Seq[A]]
  def nel[A](of: F[A]): F[NonEmptyList[A]]
  def enum[A](all: Set[A], show: A => String): F[A]
}

object JsonAlgebra {
  def apply[F[_]](implicit F: JsonAlgebra[F]): JsonAlgebra[F] = F
}
