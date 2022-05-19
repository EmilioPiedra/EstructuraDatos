public class NotasAlum {
    public  void mediaAlumno (String [] NombreAlum, double x [][]){
            double nota = 0;
        for (int i =0 ;i< x.length;i++){
            for (int j =0 ;j < x[0].length; j++){
                     nota += x[j][i];
            }
            System.out.println("Nota media de "+NombreAlum[i]+ " es: "+ nota);
        }
    }



}
