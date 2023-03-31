importar  java . útil .*;

public  class  TestaRetangulo {

    public  static  void  principal ( String [] args ) {
        Retângulo  ret1 = novo  Retângulo ();
         Teclado do scanner = novo  Scanner ( System . in );
        Sistema . fora . println ( "Digite o valor da altura do retangulo=" );
         altura dupla = teclado . próximoDuplo ();
        Sistema . fora . println ( "Digite o valor da largura do retangulo=" );
         largura dupla = teclado . próximoDuplo ();

        ret1 . setAltura ( altura );
        ret1 . setLargura ( largura );

        Sistema . fora . println ( "Área do retângulo= " + ret1 . área ());
    }
}

//arquivo2 da classe retangulo

public  class  Retângulo {

     altura dupla  privada ;
     dupla  largura privada ;

    public  void  setAltura ( double  altura ) {
        isso . altura = altura ;
    }

    public  void  setLargura ( largura dupla  ) {
        isso . largura = largura ;
    }

     área pública dupla  () {
        retornar  altura * largura ;
    }
}
