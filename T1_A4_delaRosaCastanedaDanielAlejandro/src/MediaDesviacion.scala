import scala.io.StdIn._
import scala.math._

object MediaDesviacion {
  
  def imprimir(x: Double): Unit ={
    println(x)
  }
  
  def leerDatos(): Array[Int]={
    println("Ingresa la cantidad de datos")
    var x=readInt()
    val x1=new Array[Int](x)
    for(e<-0 to x1.length-1){
      printf("ingresa el dato #%d",e+1)
      var aux=readInt()
      x1(e)=aux
    }
    x1
  }
  def calcularMedia(x: Array[Int]): Double={
   var media=0.0
     for(e<-0 to x.length-1){
       media=media+x(e)
     }
     media/x.length
  }
  def calcularDesviacion(x: Double,x1: Array[Int]): Double={
    var desviacion=0.0
    var sum=0.0
      for(e<-0 to x1.length-1){
        sum=sum+pow(x1(e)-x,2)
      }
    desviacion=sqrt(sum/x1.length)
    desviacion
  }
  
  def main(args: Array[String]): Unit={
   
    var x=leerDatos()
    var media=calcularMedia(x)
    println("Media")
     imprimir(media)
    var desviacion=calcularDesviacion(media, x)
    println("Desviacion")
    imprimir(desviacion)
    
    
    
  }
}