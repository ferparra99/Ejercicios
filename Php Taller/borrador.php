<?php 
$filename=$_POST['archivo'];
unlink($filename);
echo "Se ha eliminado";
 ?>