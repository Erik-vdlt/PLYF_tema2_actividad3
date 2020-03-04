import scala.util.control.Breaks._

object listas {

    def palabras(buscar : String,remplazar : String, palabras : List[String]) : List[String] = {
        val replace = palabras.map(x => if(x.equalsIgnoreCase(buscar)) remplazar else x)//.map { case buscar => remplazar }
        
        replace
    }

    def listaNombres(listaBorrar:List[String],listaNombres:List[String]) : List[String] = {
        val nuevaLista = listaBorrar.filter( x => !listaNombres.exists( y => x.contains(y)))
        //val nuevaLista = listaBorrar.dropWhile( x => listaNombres.exists( y => x.contains(y)))

        nuevaLista
    }

    def listaAcumulada(listaNumeros : List[Int]) : Unit = {
        var count = 0
        for (e <- listaNumeros){
            if(count >= listaNumeros.length-1){ 

            }
            else {
                listaNumeros.updated(count,(listaNumeros(count)+listaNumeros(count+1)))
                count += 1
            }
        }
        println(listaNumeros)
    }

    def capicuas(lista : List[Int]) : List[Int] = {
        val listaN = lista.filter(x => x.toString().reverse == x.toString())

        listaN
    }

    def main(args : Array[String]) : Unit = {

        val listaPalabras = List("casa","arbol","perro","escritorio","monitor","rayo")
        val listaNombres1 = List("juan","francisco","carlos","omar","javier","efren","carmelo")
        val listaNombres2 = List("juan","martha","carlos","yoanna","lizbeth","sandra","maria")
        val numeros = List(1,2,3,4,5,6,7,8,9,10)
        val capicua = List(45,14,21,100,101,161, 2992, 3003, 91019, 5005, 292, 2882, 2442)
        println("palabras "+listaPalabras+" palabra a buscar: arbol palabra remplazar: raton")
        println(palabras("arbol","raton",listaPalabras))
        println("-----------------------------------------")
        println("lista nombres 1"+listaNombres1)
        println("lista nombres 2"+listaNombres2)
        println(listaNombres(listaNombres1,listaNombres2))
        println("-----------------------------------------")
        println("lista numeros "+numeros)
        listaAcumulada(numeros)
        println("-----------------------------------------")
        println("lista de numeros capicua " +capicua)    
        print(capicuas(capicua))
    }

}