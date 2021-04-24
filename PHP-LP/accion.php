<!-- Programa realizado por:
20181103 Mamani Garcia, Gabriel
20180070 Alvarez Fernandez, Juan Sebastian
20182063 Villarroel Enriquez, Erly -->



<!-- Se lee el texto y se imprime en la misma pagina  -->
<form action="accion.php" method="post">
   <p>Texto sin modificar: <p>
   <p><textarea name="ewr"  rows=10 cols=80><?php echo htmlspecialchars($_POST['nombre']); ?></textarea>
   </form>
  <!-- Se lee el texto y se guarda en una variable   -->
<?php  $var = htmlspecialchars($_POST['nombre']);
$eliminar= array("," , ".",":","“","”");
$resultado = str_replace($eliminar,"", $var);//Se eliminan signos de puntuacion
$esp=array("\n");
$resultado3=str_replace($esp," ",$resultado);//Se reemplaza el espaciado por un espacio en blanco
$resultado2= preg_replace("/[0-9]+/", "" , $resultado3);
//Hasta acá se eliminan signos de puntuacion y números
$Unir=array();// En este array se guardaran las palabras que luego se uniran para formar el texto modificado
$Stop=array("algún","alguna","algunas","alguno","algunos","ambos","ampleamos","ante","antes","aquel",
"aquellas","aquellos","aqui","arriba","atras","bajo","bastante","bien","cada","cierta","ciertas","cierto",
"ciertos","como","con","conseguimos","conseguir","consigo","consigue","consiguen","consigues","cual","cuando",
"dentro","desde","donde","dos","el","ellas","ellos","empleais","emplean","emplear","empleas","empleo","en",
"encima","entonces","entre","era","eramos","eran","eras","eres","es","esta","estaba","estado","estais",
"estamos","estan","estoy","fin","fue","fueron","fui","fuimos","gueno","ha","hace","haceis","hacemos",
"hacen","hacer","haces","hago","incluso","intenta","intentais","intentamos","intentan","intentar","intentas",
"intento","ir","la","largo","las","lo","los","mientras","mio","modo","muchos","muy","nos","nosotros","otro",
"para","pero","podeis","podemos","poder","podria","podriais","podriamos","podrian","podrias","por","por qué",
"porque","primero","puede","pueden","puedo","quien","sabe","sabeis","sabemos","saben","saber","sabes","ser",
"si","siendo","sin","sobre","sois","solamente","solo","somos","soy","su","sus","también","teneis","tenemos",
"tener","tengo","tiempo","tiene","tienen","todo","trabaja","trabajais","trabajamos","trabajan","trabajar",
"trabajas","trabajo","tras","tuyo","ultimo","un","una","unas","uno","unos","usa","usais","usamos","usan",
"usar","usas","uso","va","vais","valor","vamos","van","vaya","verdad","verdadera","verdadero","vosotras",
"vosotros","voy","yo","él","ésta","éstas","éste","éstos","última","últimas","último","últimos","a","añadió",
"aún","actualmente","adelante","además","afirmó","agregó","ahí","ahora","al","algo","alrededor","anterior",
"apenas","aproximadamente","aquí","así","aseguró","aunque","ayer","buen","buena","buenas","bueno","buenos",
"cómo","casi","cerca","cinco","comentó","conocer","consideró","considera","contra","cosas","creo","cuales",
"cualquier","cuanto","cuatro","cuenta","da","dado","dan","dar","de","debe","deben","debido","decir","dejó",
"del","demás","después","dice","dicen","dicho","dieron","diferente","diferentes","dijeron","dijo","dio",
"durante","e","ejemplo","ella","ello","embargo","encuentra","esa","esas","ese","eso","esos","está","están",
"estaban","estar","estará","estas","este","esto","estos","estuvo","ex","existe","existen","explicó","expresó",
"fuera","gran","grandes","había","habían","haber","habrá","hacerlo","hacia","haciendo","han","hasta","hay",
"haya","he","hecho","hemos","hicieron","hizo","hoy","hubo","igual","indicó","informó","junto","lado","le",
"les","llegó","lleva","llevar","luego","lugar","más","manera","manifestó","mayor","me","mediante","mejor",
"mencionó","menos","mi","misma","mismas","mismo","mismos","momento","mucha","muchas","mucho","nada","nadie",
"ni","ningún","ninguna","ningunas","ninguno","ningunos","no","nosotras","nuestra","nuestras","nuestro",
"nuestros","nueva","nuevas","nuevo","nuevos","nunca","o","ocho","otra","otras","otros","parece","parte",
"partir","pasada","pasado","pesar","poca","pocas","poco","pocos","podrá","podrán","podría","podrían","poner",
"posible","próximo","próximos","primer","primera","primeros","principalmente","propia","propias","propio",
"propios","pudo","pueda","pues","qué","que","quedó","queremos","quién","quienes","quiere","realizó",
"realizado","realizar","respecto","sí","sólo","se","señaló","sea","sean","según","segunda","segundo","seis",
"será","serán","sería","sido","siempre","siete","sigue","siguiente","sino","sola","solas","solos","son","tal",
"tampoco","tan","tanto","tenía","tendrá","tendrán","tenga","tenido","tercera","toda","todas","todavía",
"todos","total","trata","través","tres","tuvo","usted","varias","varios","veces","ver","vez","y","ya");
//Se comparan las palabras del texto sin signos de puntuacion con las stop words y solo se agregan a la variable 
//"Unir" aquellos que no sean iguales a las stop words
$aNombres=explode(" ",$resultado2);
for($i = 0; $i < sizeof($aNombres); $i++){
  $valor=1;
  for($j = 0; $j < sizeof($Stop); $j++){
    if(strcasecmp(trim($aNombres[$i]),trim($Stop[$j]))==0){//Son iguales 
      $valor=0;break;
    }
  }
  if($valor==1){
    array_push($Unir,$aNombres[$i]);
  }
}
//A continuacion se unen los arrays con espacios " " para formar el texto final
$Final=implode(" ",$Unir);
//Ahora a contar las repeticiones de palabras
$Unicos= array_unique($Unir);
$Ocurrencias=array_count_values($Unir);?>

<form action="accion.php" method="post">
   <p>Texto modificado: <p>
   <p><textarea name="ewe"  rows=10 cols=80><?php echo $Final; ?></textarea>

  </form>
  <form action="nuevo.php" method="post">
   <p><input type="submit" value="Nuevo texto"/></p>
  </form>
    <p></p>
<p>Nube De Palabras : </p>
  <?php
  //Se imprime la nube de palabras segun las repeticiones, se usa un factor *20 para cada palabra
foreach($Unicos as $num){
  $tamaño= $Ocurrencias[$num]*20 ;
  echo '<span style="font-size:'.$tamaño.'px;">'.$num.'</span>';echo "\n";
}?>

