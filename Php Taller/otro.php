<?php 
$fi=fopen("archivo.txt","a") or die ("problema al crear archivo");
fwrite($fi,"datos: ");
fwrite($fi,"\n");
fwrite($fi,$_POST['nombre']);
fwrite($fi,"\n" );
fwrite($fi,'comentario');
fwrite($fi,"\n");
fwrite($fi, "---------------- \n \n");
fclose($fi);
echo "datos guardados";
 ?>