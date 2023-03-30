public  class  BMExercio03 {
    public  static  void  principal ( String [] args ) {
        float  kinderOvo = 3.50f ;
        float  bis = 2,95f ;
        float  taxa_$ = 8,25f ;

        Sistema . fora . println ( "Valor do Kinder Ovo: " + kinderOvo + "\nValor do Bis: " + bis );

        float  total = kinderOvo + bis ;

        Sistema . fora . println ( "\nTotal sem taxa: " + total );

        float  taxaCalculada = ( total * ( taxa_$ / 100 ));

        Sistema . fora . println ( "\nTaxa continuada: " + taxaCalculada );

        float  novoCusto = total + taxaCalculada * 2 ;

        boolean  muitoCaro = novoCusto > 10 ;

        Sistema . fora . println ( "\nVariavel 'muitoCaro': " + muitoCaro );

    }
}
