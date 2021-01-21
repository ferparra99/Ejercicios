<?php 
$archivo=fopen("archivo.txt","r") or die ("problema al abrir archivo.txt");
while (!feof($archivo))
 {
	$traer=fgets($archivo);
	$saltodelinea=nl2br($traer);
	echo $saltodelinea;
}
# se esta implementando unas condiciones las cuales dicen que el texto debe
# dar un salto de linea en cada espacio que encuentre
#nl2br = salto de linea
#feof = comprobar si el puntero esta al final del archivo
#fgets = Ibtiene una linea desde el puntero a un fichero
 ?>
