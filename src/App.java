public class App {
    public static void main(String[] args) throws Exception {
      

/*Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada uno.
Crea un objeto en cada posición del array, con los valores que desees,
 puedes usar distintos constructores.
Entrega algunos Videojuegos y Series con el método entregar().
Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, devuélvelos.
Por último, indica el Videojuego tiene más horas estimadas y la serie con
 mas temporadas. Muestralos en pantalla con toda su información (usa el método toString()). */



 Serie[] series = new Serie[5];
 Videojuego[] videojuegos = new Videojuego[5];

  
    series[0] = new Serie("The Walking Dead", 10, true, "Terror", "Frank Darabont");
    series[1] = new Serie("Breaking Bad", 5, false, "Drama", "Vince Gilligan");
    series[2] = new Serie("The Office", 9, true, "Comedia", "Greg Daniels");
    series[3] = new Serie("Friends", 10, false, "Comedia", "David Crane");
    series[4] = new Serie("The Big Bang Theory", 12, true, "Comedia", "Chuck Lorre");

    videojuegos[0] = new Videojuego("The Legend of Zelda: Breath of the Wild", 100, true, "Aventura", "Nintendo");
    videojuegos[1] = new Videojuego("The Witcher 3: Wild Hunt", 50, false, "Rol", "CD Projekt");
    videojuegos[2] = new Videojuego("Red Dead Redemption 2", 60, true, "Aventura", "Rockstar Games");
    videojuegos[3] = new Videojuego("God of War", 40, false, "Aventura", "Santa Monica Studio");
    videojuegos[4] = new Videojuego("The Last of Us Part II", 30, true, "Aventura", "Naughty Dog");

     //entregamos algunos videojuegos y series
     series[1].entregar();
     series[4].entregar();
     videojuegos[0].entregar();
     videojuegos[3].entregar();

     //Recorremos los arrays para contar cuantos entregados hay, tambien los devolvemos

     int entregados=0;

     for(int i=0;i<series.length;i++){
         if(series[i].isEntregado()){
             entregados+=1;
             series[i].devolver();

         }
         if(videojuegos[i].isEntregado()){
             entregados+=1;
             videojuegos[i].devolver();
         }
     }

     System.out.println("Hay "+entregados+" articulos entregados");

     //Creamos dos objetos con la primera posicion de cada array
     Serie serieMayor=series[0];
     Videojuego videojuegoMayor=videojuegos[0];

     //Recorremos el array desde la posicion 1 (no 0), comparando el mayor con las posiciones del array
     for(int i=1;i<series.length;i++){
         if(series[i].compareTo(serieMayor)==Serie.MAYOR){
             serieMayor=series[i];
         }
         if(videojuegos[i].compareTo(videojuegoMayor)==Videojuego.MAYOR){
             videojuegoMayor=videojuegos[i];
         }

     }

     //Mostramos toda la informacion del videojuego y serie mayor
     System.out.println(videojuegoMayor);
     System.out.println(serieMayor);
 }

}









    
